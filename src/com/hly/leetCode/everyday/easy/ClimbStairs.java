package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/22
 * @QQ :1136513099
 * @desc : 70. 爬楼梯
 * https://leetcode-cn.com/problems/climbing-stairs/
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            //b 先赋值给 a
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(new ClimbStairs().climbStairs(3));//3
        System.out.println(new ClimbStairs().climbStairs(2));//2
        System.out.println(new ClimbStairs().climbStairs(4));//6
    }
}
