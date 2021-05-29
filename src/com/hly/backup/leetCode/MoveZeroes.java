package com.hly.backup.leetCode;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/27
 */

//283.移动零
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j++;
            } else {
                nums[i - j] = nums[i];
            }
        }
        for (int i = nums.length - j; i < nums.length; i++)
            nums[i] = 0;
    }

    public static void main(String[] args) {

        int nums[] = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i : nums)
            System.out.print(i + " ");
    }
}
