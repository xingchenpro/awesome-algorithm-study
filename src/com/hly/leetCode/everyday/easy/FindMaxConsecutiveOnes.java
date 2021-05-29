package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/25
 * @desc : 485. 最大连续1的个数
 * https://leetcode-cn.com/problems/max-consecutive-ones/
 */
public class FindMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (max < count) {

                    max = count;
                }
            } else {
                count = 0;

            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new FindMaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));//3
        //临界值
        System.out.println(new FindMaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{0}));//0
    }
}
