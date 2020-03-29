package com.hly.leetCode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/29
 * @QQ :1136513099
 * @desc : 面试题57. 和为s的两个数字
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * 1、hash,2、二分,3、双指针
 */
public class TwoSum_57 {


    //解法4：暴力超时
    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{nums[i], nums[j]};
            }
        }
        return new int[]{};
    }

    //解法1：Hash，时间O(n),空间O(n)
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], target - nums[i]);//把键存到hash里面
        }
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];//计算出值
            if (map.containsKey(t)) {//如果键hash表包含值，说明数组里面有相加等于target的
                return new int[]{t, map.get(t)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int res[] = twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int re : res) {
            System.out.println(re);
        }

    }


}
