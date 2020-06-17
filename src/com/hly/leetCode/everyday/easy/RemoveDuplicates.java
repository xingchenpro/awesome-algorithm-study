package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/17
 * @QQ :1136513099
 * @desc : 26. 删除排序数组中的重复项/
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        //从索引为 0 的下标开始覆盖
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            //当前下标的数不等于 index 下标的数，当前下标的数覆盖 index+1 的数
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            }
        }
        //所剩余的不同的数，覆盖的数 + 第一个数
        return index + 1;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates().removeDuplicates(new int[]{1, 1, 3}));//2
        System.out.println(new RemoveDuplicates().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));//5
    }
}
