package com.hly.review.review8_13.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/13
 * @QQ :1136513099
 * @desc :
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count++;
            else
                nums[i - count] = nums[i];
        }
        for(int i=nums.length-count;i<nums.length;i++)
            nums[i] =0;
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
