package com.stardust.offer;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/6
 * @desc : 17. 打印从1到最大的n位数
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 */
public class PrintNumbers {

    public int[] printNumbers(int n) {
        int m = (int) (Math.pow(10, n) - 1);
        int res[] = new int[m];
        for (int i = 0; i < m; i++) {
            res[i] = i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new PrintNumbers().printNumbers(3));
    }

}
