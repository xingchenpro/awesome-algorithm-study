package com.hly.leetCode.offer.offer2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/5
 * @QQ :1136513099
 * @desc : 面试题10- II. 青蛙跳台阶问题
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class NumWays {

    public int numWays(int n) {
        //0阶有1种
        int a = 1, b = 1, c = 0;
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        for (int i = 2; i <= n; i++) {
            c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new NumWays().numWays(2));
        System.out.println(new NumWays().numWays(7));
    }
}
