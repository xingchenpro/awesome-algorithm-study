package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/22
 * @QQ :1136513099
 * @desc : 面试题53 - I. 在排序数组中查找数字 I
 */
public class Search {

    //解法1：二分查找第一个与目标相同的数
    public static int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1, count = 0;
        while (left <= right) {
            //云算法优先级 + 大于 >> 小于 /,所以加括号
            int mid = left + ((right - left) >> 2);
            //如果是大于或者等于，往前移动
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                //小于目标值，往右移动
                left = mid + 1;
            }
        }
        while (left < nums.length && nums[left++] == target) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {5, 7, 7, 8, 8, 10};
        System.out.println(search(arr, 8));


    }
}
