package com.hly.backup.offer.chapter3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/31
 * @QQ :1136513099
 * @desc :21、调整数组顺序奇数位于偶数前面
 */
public class ReorderOddEven {

    //解法1 相对位置会改变
    public void ReorderOddEven(int[] array) {
        if (array == null || array.length == 0)
            return;
        int i = 0, j = array.length - 1;
        while (i < j) {
            //这里加i<j，如果加了，只会退出这一层循环，如果不加，会退出大的while循环
            // 找出偶数
            //如果不是偶数，就向后移动
            while (i < j /*&& array[i] % 2 != 0 */ && !isEven(array[i])) {
                i++;
            }
            //如果不是奇数，就向前移动
            while (i < j/* && array[j] % 2 == 0 */ && isEven(array[j])) {
                j--;
            }
            if (i < j) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
    }
    //even 偶数
    public boolean isEven(int n) {
        //偶数返回 0 ，奇数返回 1
        //2 的倍数的二进制，最后一位都是0，全1才1
        return (n & 1) == 0;
    }
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int array2[] = {1, 1, 1, 3, 4};
        int array3[] = {2, 2, 4, 4, 5};
        int array4[] = null;
        new ReorderOddEven().ReorderOddEven(array2);
        for (int i : array2) {
            System.out.print(i + " ");
        }
    }
}
