package com.hly.leetCode.everyday.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/6
 * @desc : 349. 两个数组的交集
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> setRes = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                setRes.add(i);
            }
        }
        int[] res = new int[setRes.size()];
        Iterator<Integer> iterator = setRes.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            res[i++] = iterator.next();
        }
        return res;
    }

    public static void main(String[] args) {

        int[] res = new Intersection().intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
