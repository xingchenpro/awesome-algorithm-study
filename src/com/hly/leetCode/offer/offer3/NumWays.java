package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/20
 * @QQ :1136513099
 * @desc : AC 面试题10- II. 青蛙跳台阶问题
 */
public class NumWays {

    public int numWays(int n) {
        //0 有一种，原地不动？
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
}
