package com.stardust.top;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/6/8
 * @desc : 1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 */
public class TwoSum {

    //解法1
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t) && i != map.get(t)) {
                return new int[]{map.get(t), i};
            }
        }
        return new int[]{};
    }

    //解法2

    public static void main(String[] args) {
        int[] res = new TwoSum().twoSum(new int[]{3, 2, 4}, 6);//1,2
        for (int v : res) {
            System.out.println(v);
        }

    }
}
