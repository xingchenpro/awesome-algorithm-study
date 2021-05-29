package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/6
 * @desc : 172. 阶乘后的零
 * https://leetcode-cn.com/problems/factorial-trailing-zeroes/
 */
public class TrailingZeroes {

    //因子为 2 和 5 的对数 => 倍数为 5 的数
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new TrailingZeroes().trailingZeroes(5));//120 1
        System.out.println(new TrailingZeroes().trailingZeroes(3));// 6 0
        System.out.println(new TrailingZeroes().trailingZeroes(16));// 3
    }
}
