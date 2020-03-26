package com.hly.leetCode.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/25
 * @QQ :1136513099
 * @desc : 面试题53 - II. 0～n-1中缺失的数字
 */
public class MissingNumber_53_2 {


    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return nums.length;
    }


    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
        System.out.println(missingNumber(new int[]{1}));
        System.out.println(missingNumber(new int[]{0}));
    }
}
