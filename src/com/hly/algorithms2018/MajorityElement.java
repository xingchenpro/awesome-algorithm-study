package com.hly.algorithms2018;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/3
 */
//todo 求众数
//给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
public class MajorityElement {

    public static int majorityElement(int[] nums) {
       int num = nums[0];
       int count=1;
       for(int i=1;i<nums.length;i++){
           if(nums[i]==num){
               count++;
           }else{
               count--;
               if(count==0){
                   num=nums[i];
                   count=1;
               }
           }
       }
       return num;
    }

    public static void main(String[] args){
       int nums[]={2,2,1,1,1,2,2};
       int nums2[]={3,2,3};
       System.err.println(majorityElement(nums));
       System.err.println(majorityElement(nums2));
    }
}
//从第一个数开始count=1，遇到相同的就加1，遇到不同的就减1，减到0就重新换个数开始计数，总能找到最多的那个