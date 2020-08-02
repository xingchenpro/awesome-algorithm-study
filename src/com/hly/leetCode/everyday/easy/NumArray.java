package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/1
 * @desc : 303. 区域和检索 - 数组不可变
 * https://leetcode-cn.com/problems/range-sum-query-immutable/
 */
public class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    //解法1：简单解法
    public int sumRange(int i, int j) {
        int sum = 0;
        for (int n = i; n <= j; n++) {
            sum += nums[n];
        }
        return sum;
    }
    //解法2：hash 缓存
    //解法3：初始化覆盖 nums


    public static void main(String[] args) {
        System.out.println(new NumArray(new int[]{-2, 0, 3, -5, 2, -1}).sumRange(0, 2));//1
        System.out.println(new NumArray(new int[]{-2, 0, 3, -5, 2, -1}).sumRange(2, 5));//-1
        System.out.println(new NumArray(new int[]{-2, 0, 3, -5, 2, -1}).sumRange(0, 5));//-3
    }

}
