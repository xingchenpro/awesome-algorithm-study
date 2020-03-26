package com.hly.leetCode.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/25
 * @QQ :1136513099
 * @desc : 面试题53 - I. 在排序数组中查找数字 I
 */
public class Search_53_1 {

    public static int search(int[] nums, int target) {
        if(nums==null){
            return -1;
        }
        int count =0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
     int nums[]={5,7,7,8,8,10};
    }
}
