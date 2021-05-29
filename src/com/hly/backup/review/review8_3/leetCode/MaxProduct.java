package com.hly.backup.review.review8_3.leetCode;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/3
 * @QQ :1136513099
 * @desc : 乘积最大子序列
 */
public class MaxProduct {

    public int maxProduct(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int n = nums.length;
        int mins[] = new int[n];
        int maxs[] = new int[n];
        int res[] = new int[n];
        mins[0] = nums[0];
        maxs[0] = nums[0];
        res[0] = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] >= 0) {
                maxs[i] = Math.max(maxs[i - 1] * nums[i], nums[i]);
                mins[i] = Math.min(mins[i - 1] * nums[i], nums[i]);
            } else {
                maxs[i] = Math.max(mins[i - 1] * nums[i], nums[i]);
                mins[i] = Math.min(maxs[i - 1] * nums[i], nums[i]);
            }
            res[i] = Math.max(res[i - 1], maxs[i]);
        }
        return res[n - 1];
    }
}
