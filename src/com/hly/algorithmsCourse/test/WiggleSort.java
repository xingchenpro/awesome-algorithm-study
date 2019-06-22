package com.hly.algorithmsCourse.test;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/22
 * @QQ :1136513099
 * @desc : 摆动排序
 */

import java.util.Arrays;

/**
 * Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....
 *For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].
 */
public class WiggleSort {

    //排序法 时间 O(NlogN) 空间 O(0)
    public static int [] wiggleSort1(int nums[]){
        Arrays.sort(nums);
        for(int i=2;i<nums.length;i+=2){
            nums[i-1] = nums[i]+nums[i-1];
            nums[i] = nums[i-1]-nums[i];
            nums[i-1] = nums[i-1]-nums[i];
        }
        return nums;
    }

    public static void main(String[] args){

        int res []= wiggleSort1(new int[]{3, 5, 2, 1, 6, 4});
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }





    }
}
