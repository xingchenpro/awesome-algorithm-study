package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/17
 * @QQ :1136513099
 * @desc : TODO 26. 删除排序数组中的重复项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i-count] = nums[i];
                count++;
            }
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates().removeDuplicates(new int[]{1, 1, 3}));


    }

}
