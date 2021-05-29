package com.hly.leetCode.algorithms2018.math;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/22
 * @QQ :1136513099
 * @desc : 136. 只出现一次的数字
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result ^=nums[i];
        }
        return result;

    }

    public static void main(String[] args){
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
}
