package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/24
 * @QQ :1136513099
 * @desc : 面试题49. 丑数
 */
public class NthUglyNumber {

    //解法1：超时
    public static int nthUglyNumber(int n) {
        int find = 0;
        int index = 0;
        while (find < n) {
            index++;
            if (isUgly(index))
                find++;
        }
        return index;
    }

    public static boolean isUgly(int num) {
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0)
            num /= 3;
        while (num % 5 == 0)
            num /= 5;
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
}
