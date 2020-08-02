package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/2
 * @desc : 326. 3的幂
 * https://leetcode-cn.com/problems/power-of-three/
 */
public class IsPowerOfThree {

    //解法1：循环
    public boolean isPowerOfThree(int n) {
        if (n == 0)
            return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    //解法2：3 的次幂的最大值
    public boolean isPowerOfThree2(int n) {
        return n > 0 && 1162261467 % n == 0;
    }


    public static void main(String[] args) {

        System.out.println(new IsPowerOfThree().isPowerOfThree(27));//true
        System.out.println(new IsPowerOfThree().isPowerOfThree(0));//false
        System.out.println(new IsPowerOfThree().isPowerOfThree(9));//true
        System.out.println(new IsPowerOfThree().isPowerOfThree(45));//false
    }
}
