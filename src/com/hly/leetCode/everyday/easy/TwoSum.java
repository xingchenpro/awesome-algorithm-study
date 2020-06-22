package com.hly.leetCode.everyday.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/15
 * @QQ :1136513099
 * @desc : 1. 两数之和
 * https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            //需要判断不能等于当前数
            if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i){
                int [] res = {i,map.get(target-nums[i])};
                return res;
            }
        }
        return new int[]{};
    }


    public static void main(String[] args){
        int [] nums = {2,7,11,15};//9 | 0,1
        int [] nums1 = {3,2,4};//6 | 1,2
        int [] res = new TwoSum().twoSum(nums1,6);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

}
