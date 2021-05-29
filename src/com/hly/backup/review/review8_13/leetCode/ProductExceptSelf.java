package com.hly.backup.review.review8_13.leetCode;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/13
 * @QQ :1136513099
 * @desc :
 */
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        int output[] = new int[nums.length];
        int k = 1;
        //左边乘积
        for (int i = 0; i < nums.length; i++) {
            output[i] = k;
            k *= nums[i];
        }
        k = 1;
        //右边乘积
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= k;
            k *= nums[i];
        }
        return output;
    }


}
