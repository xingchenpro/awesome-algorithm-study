package com.hly.leetCode.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/2/28
 * @QQ :1136513099
 * @desc : 面试题10- I. 斐波那契数列
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 输入：n = 5
 * 输出：5
 */
public class Fib_10_1 {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            //超过1000000007需要取模
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fib(2));
        System.out.println(fib(1));
        System.out.println(fib(3));
        System.out.println(fib(45));//134903163
        System.out.println(fib(48));//134903163
    }
}
