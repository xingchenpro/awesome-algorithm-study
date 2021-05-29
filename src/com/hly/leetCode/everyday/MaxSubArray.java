package com.hly.leetCode.everyday;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/20
 * @QQ :1136513099
 * @desc : 53. 最大子序和
 */
public class MaxSubArray {

    //https://leetcode-cn.com/problems/maximum-subarray/solution/zui-da-zi-xu-he-by-leetcode/
    public static int maxSubArray(int[] nums) {
      int res = nums[0];
      int sum =0 ;
      for(int i=0;i<nums.length;i++){
          if(sum>0){
              sum = sum+nums[i];
          }else{
              sum = nums[i];
          }
          res = Math.max(res,sum);
      }
      return res;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
}
