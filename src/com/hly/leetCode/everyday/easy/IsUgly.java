package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/28
 * @desc : 263. 丑数
 * https://leetcode-cn.com/problems/ugly-number/
 */
public class IsUgly {

    //解法1：暴力
    public boolean isUgly(int num) {
        if (num < 1)
            return false;
        while (num % 5 == 0)
            num /= 5;
        while (num % 3 == 0)
            num /= 3;
        while (num % 2 == 0)
            num >>= 1;
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(new IsUgly().isUgly(6));//true 2*3
        System.out.println(new IsUgly().isUgly(8));//true 2*2*2
        System.out.println(new IsUgly().isUgly(14));//false 2*7
    }
}
