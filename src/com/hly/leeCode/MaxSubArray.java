package com.hly.leeCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/20
 */
//53.最大子序和
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i]>nums[i]+nums[i-1]?nums[i]:nums[i]+nums[i-1];
            if(nums[i]>max)
                max = nums[i];
        }
        return max;
    }



    public static void main(String[] args){
        int arrays [] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arrays));
    }
}
