package com.hly.algorithms2018;

import java.util.HashMap;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/11
 */
//AC 存在重复元素
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        HashMap<String, Object> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            if (hashMap.get(String.valueOf(nums[i])) == null) {
                hashMap.put(String.valueOf(nums[i]), nums[i]);
            }
            else
                flag =true;
        return flag;
    }

    public static void main(String[] args) {
        int nums1[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int nums2[] = {1, 2, 3, 4};
        int nums3[] = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }
}
//万能的HashMap