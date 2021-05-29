package com.hly.leetCode.algorithms2018.arrays;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/22
 * @QQ :1136513099
 * @desc : 238. 除自身以外数组的乘积
 */
public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int output[] = new int [nums.length];
        int k =1;
        //左边的乘积
        for(int i=0;i<nums.length;i++){
            output[i] = k;
            k*=nums[i];
        }
        //右边的乘积
        k =1;
        for(int i=nums.length-1;i>=0;i--){
            output[i]*=k;
            k*=nums[i];
        }
        return output;

    }

    public static void main(String[] args){

        int output[] = productExceptSelf(new int[]{1,2,3,4});
        for (int i : output) {
            System.out.print(i+" ");
        }
    }
}
