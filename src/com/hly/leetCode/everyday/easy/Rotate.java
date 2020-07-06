package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/6
 * @desc : 189. 旋转数组
 * https://leetcode-cn.com/problems/rotate-array/
 */
public class Rotate {

    public void rotate(int[] nums, int k) {
        int[] b = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            b[(i + k) % nums.length] = nums[i];
        }
        //b 从 0 开始复制， num 从 0 开始接受复制，复制 nums.length 个数
        System.arraycopy(b, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {


    }

}
