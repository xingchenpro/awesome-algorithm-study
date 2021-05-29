package com.hly.leetCode.everyday.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/10
 * @desc : 202. 快乐数
 * https://leetcode-cn.com/problems/happy-number/
 */
public class IsHappy {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = n;
        while (sum != 1) {
            int t = sum;
            sum = 0;
            while (t != 0) {
                sum += Math.pow(t % 10, 2);
                t /= 10;
            }
            if (set.contains(sum)) {
                return false;
            } else {
                set.add(sum);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsHappy().isHappy(19));//true
        System.out.println(new IsHappy().isHappy(2));//false
        System.out.println(new IsHappy().isHappy(7));//true

    }
}
