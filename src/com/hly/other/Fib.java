package com.hly.other;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/20
 * @QQ :1136513099
 * @desc :
 */
public class Fib {

    public static int fib(int N) {
        if (N == 0){
            return 0;
        }
        if (N == 1 || N == 2)
            return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= N; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
        System.out.println(fib(8));
        System.out.println(fib(2));
        System.out.println(fib(3));
    }
}
