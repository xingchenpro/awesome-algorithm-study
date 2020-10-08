package com.hly.leetCode.everyday.easy;

import java.util.Arrays;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/10/8
 * @desc : 561. 数组拆分 I
 * https://leetcode-cn.com/problems/array-partition-i/
 */
public class ArrayPairSum {


    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;

    }
}
