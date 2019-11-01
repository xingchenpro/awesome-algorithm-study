package com.hly.backup.offer.chapter2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc :10、斐波那契数列 F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 * 1、1、2、3、5、8、13、21、34
 */
public class Fibonacci {
    //解法1 递归
    public int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //解法2 面试官期待的解法
    public int fibonacci2(int n) {
        if (n <= 1)
            return n;
        int i = 1, j = 1, fin = 0;
        for (int k = 3; k <= n; k++) {
            fin = i + j;
            i = j;
            j = fin;
        }
        return fin;
    }
    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci2(10));
        System.out.println(new Fibonacci().fibonacci2(8));
        System.out.println(new Fibonacci().fibonacci(8));
        System.out.println(new Fibonacci().fibonacci2(0));
        System.out.println(new Fibonacci().fibonacci2(1));
        System.out.println(new Fibonacci().fibonacci2(2));
        System.out.println(new Fibonacci().fibonacci2(3));
    }
}
