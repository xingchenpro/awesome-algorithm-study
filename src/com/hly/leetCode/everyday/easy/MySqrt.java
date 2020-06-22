package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/22
 * @QQ :1136513099
 * @desc : 69. x 的平方根
 * https://leetcode-cn.com/problems/sqrtx/
 */
public class MySqrt {

    public int mySqrt(int x) {
        int i = 1;
        //防止溢出 ，i*i 会先计算 i+i的值，会越界。使用 long 再强制转化也可以
        while (x / i >= i) {
            i++;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        System.out.println(new MySqrt().mySqrt(4));//2
        System.out.println(new MySqrt().mySqrt(8));//2
        System.out.println(new MySqrt().mySqrt(2147395600));//46340
    }
}
