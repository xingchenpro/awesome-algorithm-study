package com.hly.leetCode.algorithms2018.arrays;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/22
 * @QQ :1136513099
 * @desc : 189. 旋转数组
 */
public class Rotate {

    //暴力(会超时)
    public static  void rotate1(int[] nums, int k) {
        for (int i = 0; i <k ; i++) {
            int previous = nums[nums.length-1];
            for (int j = 0; j <nums.length ; j++) {
                nums[j] = nums[j]+previous;
                previous = nums[j] -previous;
                nums[j] = nums[j] -previous;
            }
        }
    }

    public static  void rotate2(int[] nums, int k) {

        int x [] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            x[(i+k)%nums.length] = nums[i];
        }
        for (int i=0;i<nums.length;i++)
            nums[i] = x[i];
    }

    public static void main(String[] args){
        int[]array = new int[]{1,2,3,4,5};
        rotate2(array,3);
        for (int i : array) {
            System.out.print(i+" ");
        }

    }


}
