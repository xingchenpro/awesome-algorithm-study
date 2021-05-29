package com.hly.leetCode.everyday.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/12
 * @desc :  350. 两个数组的交集 II
 * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 */
public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            int count = map.getOrDefault(i, 0) + 1;
            map.put(i, count);
        }
        int[] res = new int[nums1.length];
        int idx = 0;
        for (int i : nums2) {
            int count = map.getOrDefault(i, 0);
            if (count > 0) {
                res[idx++] = i;
                count--;
                if (count > 0) {
                    map.put(i, count);
                } else {
                    map.remove(i);
                }
            }
        }
        return Arrays.copyOfRange(res, 0, idx);
    }

    public static void main(String[] args) {
        int[] res = new Intersect().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        for (int re : res) {
            System.out.print(re + " ");
        }
    }

}
