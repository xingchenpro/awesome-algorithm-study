package com.hly.offer.chapter3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc :16、数值的整数次方
 */
public class Power {

    //关键点：递归，指数的平方
    public double power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        //不是负数
        boolean isNegative = false;
        if (exponent < 0) {
            //先转化成正数
            exponent = -exponent;
            //负数
            isNegative = true;
        }
        //右移 1，除以2
        double result = power(base, exponent >> 1);
        result *= result;
        //预防%2不等于0的情况下，如果%2不等于0，再乘一下就行，！！！
        if (exponent % 2 != 0)
            result *= base;
        return isNegative ? 1 / result : result;

    }

    public static void main(String[] args) {
        System.out.println(new Power().power(3, 0));
        System.out.println(new Power().power(3, 3));
        System.out.println(new Power().power(3, -2));
    }
}
