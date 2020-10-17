package com.hly.leetCode.everyday.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/10/17
 * @desc : 594. 最长和谐子序列
 * https://leetcode-cn.com/problems/longest-harmonious-subsequence/
 */
public class FindLHS {


    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        //需要包含 key+1
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if(map.containsKey(m.getKey()+1)){
                max = Math.max(max, m.getValue() + map.get(m.getKey()+1));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new FindLHS().findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
        System.out.println(new FindLHS().findLHS(new int[]{1, 2, 3, 4}));
        System.out.println(new FindLHS().findLHS(new int[]{1, 1,1,1}));
    }

}
