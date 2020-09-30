package com.hly.leetCode.everyday.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/9/29
 * @desc : 532. 数组中的K-diff数对
 * https://leetcode-cn.com/problems/k-diff-pairs-in-an-array/
 */
public class FindPairs {

    public int findPairs(int[] nums, int k) {
        if (k < 0)
            return 0;
        Set<Integer> saw = new HashSet<>();
        Set<Integer> diff = new HashSet<>();
        for (int num : nums) {
            if (saw.contains(num - k)) {
                diff.add(num - k);
            }
            if (saw.contains(num + k)) {
                diff.add(num);
            }
            saw.add(num);
        }
        return diff.size();
    }

    public static void main(String[] args) {
        System.out.println(new FindPairs().findPairs(new int[]{1, 2, 3, 4, 5}, 1));//4
        System.out.println(new FindPairs().findPairs(new int[]{3, 1, 4, 1, 5}, 2));//2
        System.out.println(new FindPairs().findPairs(new int[]{1, 3, 1, 5, 4}, 0));//1
        System.out.println(new FindPairs().findPairs(new int[]{1, 2, 3, 4, 5}, -1));//0
    }

}
