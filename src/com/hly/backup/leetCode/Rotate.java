package com.hly.backup.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/26
 */
//189.旋转数组
public class Rotate {

    public static void rotate(int[] nums, int k) {
        int a[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++)
            nums[i] = a[i];
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7,};
        rotate(nums, 3);
        for (int i : nums)
            System.out.print(i + " ");
    }
}
