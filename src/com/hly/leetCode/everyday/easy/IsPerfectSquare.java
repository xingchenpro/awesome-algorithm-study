package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/11
 * @desc : 367. 有效的完全平方数
 * https://leetcode-cn.com/problems/valid-perfect-square/
 */
public class IsPerfectSquare {


    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        //long
        long left = 2, right = num / 2, x, guess;
        while (left <= right) {
            x = left + (right - left) / 2;
            guess = x * x;
            if (guess == num) {
                return true;
            } else if (guess > num) {
                right = x - 1;
            } else {
                left = x + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new IsPerfectSquare().isPerfectSquare(16));//true
        System.out.println(new IsPerfectSquare().isPerfectSquare(14));//false
        System.out.println(new IsPerfectSquare().isPerfectSquare(1));//true
        System.out.println(new IsPerfectSquare().isPerfectSquare(100));//true
    }


}
