package com.hly.leetCode.leetCode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/21
 * @QQ :1136513099
 * @desc : 1. 两数之和
 * https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum {

    //解法1：hash
    public static int[] twoSum(int[] nums, int target) {
        int []res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
          int t = target-nums[i];
          if(map.containsKey(t)&&map.get(t)!=i){
              res[0] = map.get(t);
              res[1] = i;
              return res;
          }
        }
        return res;
    }

    public static void main(String[] args){

        int [] arr = {3,2,4};
        int []res = twoSum(arr,6);
        for (int re : res) {
            System.out.print(re+" ");
        }
    }
}
