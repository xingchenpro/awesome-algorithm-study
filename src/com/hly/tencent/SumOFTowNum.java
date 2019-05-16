package com.hly.tencent;

import java.util.Arrays;

/**
 * @author :hly
 * @github :github.com/SiriusHly
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/10/1
 */
public class SumOFTowNum {


    public static  int[] twoSum(int[] nums, int target) {
        int result[] = new int [2];
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){

        int num[] ={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(num, target)));

    }

}
