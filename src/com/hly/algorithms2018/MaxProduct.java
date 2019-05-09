package com.hly.algorithms2018;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/7
 */
//todo 乘积最大子序列
//给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）。
public class MaxProduct {

    public static int maxProduct(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        int x[] = new int [nums.length];
        int y[] = new int [nums.length];
        int z[] = new int [nums.length];
        x[0] =nums[0];//x,y保存每一步的最大最小值
        y[0] =nums[0];
        z[0] =nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]>=0){
                x[i]=Math.max(nums[i]*x[i-1],nums[i]);
                y[i]=Math.min(nums[i]*y[i-1],nums[i]);
            }
            else{
                x[i]=Math.max(nums[i]*y[i-1],nums[i]);//核心
                y[i]=Math.min(nums[i]*x[i-1],nums[i]);
            }
            z[i]=Math.max(z[i-1],x[i]);
        }
        return z[nums.length-1];
    }

    public static void main(String[] args){
        int nums[] ={2,3,-2,4};
        int nums2[] ={-2,0,-1};
        int nums3[] ={-2,3,-4};
        System.out.println(maxProduct(nums));
        System.out.println(maxProduct(nums2));
        System.out.println(maxProduct(nums3));
    }
}

//有正数和负数，两个负数相乘为正数，可能是最大结果
//动态规划，状态转移