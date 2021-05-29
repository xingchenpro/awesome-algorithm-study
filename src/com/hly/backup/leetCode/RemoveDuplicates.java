package com.hly.backup.leetCode;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/18
 */

//26.删除排序数组中的重复项
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j+1;//不能返回数组得长度，j+1 代表长度
    }

    //1,1,2,3,4,4
    //1,2,3,4
    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int nums2[] = {1,1,2};
        System.out.println(removeDuplicates(nums2));
    }
}
