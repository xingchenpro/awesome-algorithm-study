package com.hly.backup.review.review8_3.leetCode;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/3
 * @QQ :1136513099
 * @desc :
 */
public class Rotate {

    //1 2 3 4 5 6 7
    //5 6 7 1 2 3 4
    //复制
    public void rotate(int[] nums, int k) {
        int x[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            x[(i+k)%nums.length] = nums[i];
        }
        System.arraycopy(x,0,nums,0,nums.length);
    }

    //翻转
}
