package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/2
 * @desc :342. 4的幂
 * https://leetcode-cn.com/problems/power-of-four/
 */
public class IsPowerOfFour {

    public boolean isPowerOfFour(int num) {
        if (num == 0)
            return false;
        while (num % 4 == 0) {
            num /= 4;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(new IsPowerOfFour().isPowerOfFour(16));//true
        System.out.println(new IsPowerOfFour().isPowerOfFour(5));//false
        System.out.println(new IsPowerOfFour().isPowerOfFour(0));//false

    }

}
