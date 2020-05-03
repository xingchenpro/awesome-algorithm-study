package com.hly.leetCode.leetCode.medium;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/27
 * @QQ :1136513099
 * @desc : TODO 33. 搜索旋转排序数组
 */
public class Search {

    public static int search(int[] nums, int target) {

        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            //把数组分成两部分，如果左边部分是有序的
            if (nums[0] <= nums[mid]) {
                //目标值小于中间的数 & 目标值大于或等于第一个值，从左边找
                if (target < nums[mid] && nums[0] <= target) {
                    j = mid - 1;
                } else {
                    //否则从右边找
                    i = mid + 1;
                }
                //如果右边部分是有序的
            } else {
                //目标值大于中间的数 & 目标值小于或等于末尾的数，从右边找
                if (target > nums[mid] && target <= nums[nums.length - 1]) {
                    i = mid + 1;
                } else {
                    //否则从左边找
                    j = mid - 1;

                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int[] nums1 = {0, 1, 2, 4, 5, 6, 7};
        int[] nums2 = {5, 1, 3};
        System.out.println(search(nums2, 5));
    }

}
