package com.hly.leetCode.offer.offer1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/1
 * @QQ :1136513099
 * @desc : 面试题17. 打印从1到最大的n位数
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 */
public class PrintNumbers_17 {

    //解法1：
    public static int[] printNumbers(int n) {
        int[] arr = new int[(int) Math.pow(10, n) - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = printNumbers(3);
        int[] arr2 = printNumbers(1);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
