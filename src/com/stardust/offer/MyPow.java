package com.stardust.offer;

/**
 * @author :hly
 *
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
    //超时 O(n)
    //二次幂 log2N
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        double res = 1.;
        long m = n;
        if (m < 0) {
            x = 1 / x;
            m = -m;
        }
        while (m > 0) {
            //&,位运算，都是 1 才为 1 ,判断奇数偶；相当于 m % 2==1
            //如果是奇数,乘本身，下面需要 /2
            if ((m & 1) == 1)
                res *= x;
            x *= x;
            //右移一位，即 m/2,
            m >>= 1;
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(new MyPow().myPow(2.00000, 10));
        System.out.println(new MyPow().myPow(2.10000, 3));
        System.out.println(new MyPow().myPow(2.00000, -2));

    }
}
