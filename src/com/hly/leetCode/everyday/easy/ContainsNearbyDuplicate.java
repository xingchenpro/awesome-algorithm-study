package com.hly.leetCode.everyday.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/14
 * @desc : 219. 存在重复元素 II
 * https://leetcode-cn.com/problems/contains-duplicate-ii/
 */
public class ContainsNearbyDuplicate {

    //解法1：HashMap
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        boolean flag = false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                //只有有一对符合即可，当前没有，继续遍历
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    flag = true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 0, 1, 1};
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(nums1, 3));//true
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(nums2, 1));//true
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(nums3, 2));//false
    }
}
