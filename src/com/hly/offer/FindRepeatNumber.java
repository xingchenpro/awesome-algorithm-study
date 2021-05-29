package com.hly.offer;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/3
 * @QQ :1136513099
 * @desc : 面试题03. 数组中重复的数字
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 */
public class FindRepeatNumber {

    //解法1：
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if(nums[i]==nums[nums[i]])
                    return nums[i];
                int t = nums[i];
                nums[i] = nums[t];
                nums[t] = t;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []nums={2, 3, 1, 0, 2, 5, 3};
        System.out.println(new FindRepeatNumber().findRepeatNumber(nums));
    }
}
