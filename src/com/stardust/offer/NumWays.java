package com.stardust.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/4/25
 * @desc : 10- II. 青蛙跳台阶问题
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */
public class NumWays {

    public int numWays(int n) {
        int a = 1, b = 1, c;
        for (int i = 0; i < n; i++) {
            c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(new NumWays().numWays(0));//1
        System.out.println(new NumWays().numWays(1));//1
        System.out.println(new NumWays().numWays(2));//2
        System.out.println(new NumWays().numWays(5));//8

    }
}
