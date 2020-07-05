package com.hly.leetCode.everyday.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/5
 * @desc : 167. 两数之和 II - 输入有序数组
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum167 {

    //解法1：Hash
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int tmp = target - numbers[i];
            if (map.containsKey(tmp) && map.get(tmp) != i) {
                //返回下标从 1 开始，所以 +1
                return new int[]{i + 1, map.get(tmp) + 1};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int res[] = new TwoSum167().twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
