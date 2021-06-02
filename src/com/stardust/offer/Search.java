package com.stardust.offer;

/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/6/2
 * @desc : Offer 53 - I. 在排序数组中查找数字 I
 * 统计一个数字在排序数组中出现的次数。
 */
public class Search {


    public int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
    }
    //TODO 二分

    public static void main(String[] args) {

        System.out.println(new Search().search(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }


}
