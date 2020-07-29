package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/28
 * @desc : 268. 缺失数字
 * https://leetcode-cn.com/problems/missing-number/
 */
public class MissingNumber {


    //解法1：异或(相同为 0，0和任何数异或为任何数)
    //https://leetcode-cn.com/problems/single-number/
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
            res ^= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(new MissingNumber().missingNumber(nums));
    }

}
