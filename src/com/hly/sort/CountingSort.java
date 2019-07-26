package com.hly.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc : 计数排序
 */
public class CountingSort {

    public static void countSort(int[] arrays, int b[]) {
        int c[] = new int[arrays.length];
        //初始化操作，数组c的值全部设置为0
        for (int i = 0; i < arrays.length; i++) {
            c[i] = 0;
        }
        //遍历每一个输入的值，如果一个元素输入值为i，则从c[i]加1
        //c[i]保存的就是等于i的元素的个数
        for (int j = 1; j < arrays.length; j++) {
            c[arrays[j]]++;
        }
        //计算有多少个元素是小于或等于i的
        for (int i = 1; i < arrays.length; i++) {
            c[i] = c[i] + c[i - 1];
        }
        for (int j = arrays.length - 1; j >= 1; j--) {
            //把每个元素a[j]放到输出数组b的正确位置上
            b[c[arrays[j]]] = arrays[j];
            //如果有多个相同的数，则需要减一，那么下一个相同的数将会放到该数的前一个位置上
            c[arrays[j]] -= 1;
        }
    }
    public static void main(String[] args) {
        int arrays[] = new int[]{0, 5, 4, 1, 2, 3};
        int b[] = new int[arrays.length];
        countSort(arrays, b);
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
