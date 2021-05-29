package com.hly.leetCode.algorithms2018.arrays;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/25
 * @QQ :1136513099
 * @desc :
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        for (int i = nums.length - count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {

        int num[] = new int[]{0, 1, 0, 3, 12};
        int num2[] = new int[]{1};
        new MoveZeroes().moveZeroes(num2);
        for (int i : num2) {
            System.out.print(i + " ");
        }
    }

}
