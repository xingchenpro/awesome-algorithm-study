package com.stardust.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/5
 * @desc : 16. 数值的整数次方
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 */
public class MyPow {

    //注意 3 个问题
    //1、负数
    //2、小数
    //3、精确位数
    public double myPow(double x, int n) {
        double res = 1.0;
        while (n > 0) {
            res *= x;
            n--;
        }
        return n < 0 ? 1 / res : res;
    }


    public static void main(String[] args) {
        System.out.println(new MyPow().myPow(2.00000, 10));
        System.out.println(new MyPow().myPow(2.10000, 3));
        System.out.println(new MyPow().myPow(2.00000, -2));

    }
}
