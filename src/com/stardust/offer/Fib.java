package com.stardust.offer;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/4/24
 * @desc : 10- I. 斐波那契数列
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 */
public class Fib {

    //递归(超时) 2^n
    public int fib1(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return (fib1(n - 1) + fib1(n - 2)) % 1000000007;
    }

    //动态规划 O(n)
    public int fib2(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        for (int i = 3; i <= n; i++) {
            nums[i] = (nums[i - 1] + nums[i - 2]) % 1000000007;
        }
        return nums[n];
    }

    //循环 O(n)
    public int fib3(int n) {
        int a = 0, b = 1, c;
        // x < n
        for (int i = 0; i < n; i++) {
            c = (a + b) % 1000000007;//
            a = b;//
            b = c;//
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(new Fib().fib1(2));//1
        System.out.println(new Fib().fib1(5));//5
        System.out.println(new Fib().fib1(8));//21

        System.out.println(new Fib().fib2(2));//1
        System.out.println(new Fib().fib2(5));//5
        System.out.println(new Fib().fib2(8));//21
        System.out.println(new Fib().fib2(0));//1

        System.out.println(new Fib().fib3(2));//1
        System.out.println(new Fib().fib3(5));//5
        System.out.println(new Fib().fib3(8));//21
        System.out.println(new Fib().fib3(0));//1
    }


}
