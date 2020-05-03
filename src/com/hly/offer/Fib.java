package com.hly.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : AC 面试题10- I. 斐波那契数列
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 */
public class Fib {

    //解法1：递归(超时 nlogn)
    public int fib1(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return fib1(n - 1) + fib1(n - 2);
    }

    //解法2：数组迭代
    public int fib2(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i <= n; i++) {
            res[i] = (res[i - 1] + res[i - 2]) % 1000000007;
        }
        return res[n];
    }

    //解法3：原地
    public int fib3(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(new Fib().fib3(8));
    }
}
