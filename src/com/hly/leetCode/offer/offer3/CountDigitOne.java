package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/28
 * @QQ :1136513099
 * @desc : 面试题43. 1～n整数中1出现的次数
 */
public class CountDigitOne {


    public static int countDigitOne(int n) {

        return -1;
    }

    //解法1：暴力，超时
    public static int countDigitOne1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int t = i;
            while (t != 0) {
                int j = t % 10;
                if (j == 1) {
                    sum++;
                }
                t /= 10;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(countDigitOne(12));
    }

}
