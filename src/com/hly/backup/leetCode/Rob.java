package com.hly.backup.leetCode;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/27
 */
//198.打家劫舍
public class Rob {

    //奇数位和偶数位之和谁最大
    //动态规划
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n <= 1) return n == 0 ? 0 : nums[0];
        int m[] = new int[n];
        m[0] = nums[0];
        m[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++)
            m[i] = Math.max(m[i - 1], nums[i] + m[i - 2]);
        return m[n - 1];
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 9, 3, 1};
        int nums2[] = {2, 1, 1, 2};
        System.out.println(rob(nums));
        System.out.println(rob(nums2));
    }
}
