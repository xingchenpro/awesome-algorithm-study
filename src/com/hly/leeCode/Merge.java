package com.hly.leeCode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/20
 */
//88.合并两个有序的数组
public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i=0;i<nums2.length;i++){
           nums1[m++] = nums2[i];
       }
        Arrays.sort(nums1);
    }

    public static void main(String[] args){

    }
}
