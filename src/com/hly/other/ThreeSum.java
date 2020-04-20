package com.hly.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/20
 * @QQ :1136513099
 * @desc :
 */
public class ThreeSum {

    //https://leetcode-cn.com/problems/3sum/
    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int tmp = nums[i];
            int k = i + 1, j = nums.length - 1;
            while (k < j) {
                if (tmp + nums[k] + nums[j] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(tmp);
                    list.add(nums[k]);
                    list.add(nums[j]);
                    res.add(list);
                    k++;
                    j--;
                    while (k < j && nums[k] == nums[k] - 1) k++;
                    while (k < j && nums[j] == nums[j + 1]) j--;
                } else if (tmp + nums[k] + nums[j] > 0) {
                    j--;
                } else {
                    k++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
