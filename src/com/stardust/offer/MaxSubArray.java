package com.stardust.offer;


/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/5/29
 * @desc :输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res + nums[i], nums[i]);
            max = Math.max(max, res);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MaxSubArray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));//6
        System.out.println(new MaxSubArray().maxSubArray(new int[]{-2, 1}));//1
    }

}
