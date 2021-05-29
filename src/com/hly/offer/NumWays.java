package com.hly.offer;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : AC 面试题10- II. 青蛙跳台阶问题(斐波那契数列)
 * https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 */
public class NumWays {

    //解法1：原地迭代
    public int numWays(int n) {
        if (n == 0 || n == 1)
            return 1;
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args){
        System.out.println(new NumWays().numWays(8));
        System.out.println(new NumWays().numWays(7));
    }
}
