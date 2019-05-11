package com.hly.algorithms2018;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/11
 */
//AC 移动零
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                count++;
            else
            nums[i-count]=nums[i];

        }
        for(int i=nums.length-count;i<nums.length;i++)
            nums[i] = 0;
        for(int i:nums)
            System.out.print(i+" ");
    }

    public static void main(String[] args){
        int nums[] ={0,1,0,3,12};
        moveZeroes(nums);
    }
}
