package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/22
 * @QQ :1136513099
 * @desc : 面试题53 - II. 0～n-1中缺失的数字
 */
public class MissingNumber {


    public static int missingNumber2(int[] nums) {

        //一共有 nums.length 个数字，值域是 0~nums.length,如果对不上，直接返回 i
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        //如果对不上，则缺少的是最后一个
        return nums.length;

    }

    //二分法
    public static int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        //找到第一个与下标不一致的左边界
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 8, 9};//8
        int[] arr2 = {0, 1, 3};
        int[] arr3 = {0};
        System.out.println(missingNumber(arr));

    }
}
