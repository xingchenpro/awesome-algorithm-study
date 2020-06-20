package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/20
 * @QQ :1136513099
 * @desc : 53. 最大子序和
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        //初始化最大值
        int max = Integer.MIN_VALUE;
        //当前的和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            //当前的和大于 0 就加上，
            if (sum > 0) {
                sum += nums[i];
                //如果是小于 0 ,加上会变得更小，直接赋值给当前值
            } else {
                sum = nums[i];
            }
            //比较当前序列是否为最大
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MaxSubArray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));//6
        System.out.println(new MaxSubArray().maxSubArray(new int[]{-2, 1}));//1
    }
}
