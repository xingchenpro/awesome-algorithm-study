package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/29
 * @desc : 283. 移动零
 * https://leetcode-cn.com/problems/move-zeroes/
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }else{
                nums[i-count] = nums[i];
            }
        }
        for(int i = nums.length-count;i<nums.length;i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args){

        int [] nums = {0,1,0,3,12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }

}
