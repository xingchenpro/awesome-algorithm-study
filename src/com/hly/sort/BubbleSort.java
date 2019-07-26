package com.hly.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc : 冒泡排序
 */
public class BubbleSort {

    public static void bubbleSort(int arrays[]) {
        for (int i = 0; i < arrays.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    arrays[j] = arrays[j] + arrays[j + 1];
                    arrays[j + 1] = arrays[j] - arrays[j + 1];
                    arrays[j] = arrays[j] - arrays[j + 1];
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arrays = new int[]{5, 4, 3, 3, 1};
        bubbleSort(arrays);
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}
