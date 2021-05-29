package com.hly.leetCode.everyday.easy;

import java.util.Arrays;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/19
 * @desc : TODO 453. 最小移动次数使数组元素相等
 * https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
 */
public class MinMoves {

    //题目的解释不清楚，应该是每次移动，除了移动的数，其他的数都+1
    //n 个数，n-1 个数 +1，可理解为第 1 个数 -1，每次让一个值减去1，使得所有的值相等，那理想情况就是每个值最终等于最小值
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            count += nums[i] - nums[0];
        }
        return count;
    }

    public static void main(String[] args) {
        //[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
        //移动 3 ，其他两个数 +1
        //移动 3 ，其他两个数 +1
        System.out.println(new MinMoves().minMoves(new int[]{1, 2, 3}));//3

    }
}
