package com.stardust.offer;

/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/6/3
 * @desc : *53 - II. 0～n-1中缺失的数字
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        //left 对应第一个缺失的数字，返回 left 下标
        return left;
    }

    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber(new int[]{0, 1, 2, 3, 5, 6}));
    }


}
