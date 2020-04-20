package com.hly.leetCode.offer.offer2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/6
 * @QQ :1136513099
 * @desc : 面试题16. 数值的整数次方
 * 实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。
 * 思路：快速幂实际上是二分思想的一种应用,每次把幂n降为n/2,直至降为0.
 * 1、当x=0时，直接返回0
 * 2、初始化res=1
 * 3、当n《0时，把问题转化为n>0范围内，及x=1/x,n=-n
 * 4、计算
 * 1）n=0时跳出
 * 2）n&1=1(n%2=1) ,res*=x
 * 3)x*=x(x=x^2)
 * 4)n>>1(x/=2)
 */
public class MyPow {

    public double myPow(double x, int n) {
        if (x == 0)
            return 0;
        long b = n;
        double res = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if ((b & 1) == 1)
                res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new MyPow().myPow(2.00000, 10));
        System.out.println(new MyPow().myPow(2.00000, -2));
    }

}
