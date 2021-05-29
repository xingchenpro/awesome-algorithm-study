package com.hly.backup.leetCode;

import java.util.*;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/4/1
 */
//349. 两个数组的交集
public class Intersection {
    //1.第三个数组的大小确定
    //2.重复元素
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set set = new HashSet();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                        set.add(nums1[i]);
                }
            }
        }
        int nums [] = new int [set.size()];
        int i =0;
       Iterator<Integer> iterator = set.iterator();
       while (iterator.hasNext()){
           nums[i] = iterator.next();
       }
        return nums;
    }

    public static void main(String[] args){
        int nums1 [] ={1,2,2,1};
        int nums2 [] ={2,2};
        int nums[] = intersection(nums1,nums2);
        for(int i:nums)
            System.out.print(i+" ");
    }
}
