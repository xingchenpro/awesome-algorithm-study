package com.hly.algorithms2018;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/7
 */
//todo 旋转数组
//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
public class Rotate {

    public static void rotate(int[] nums, int k) {
        if (nums.length == 1 || k == 0)
            return;
        int n = nums.length;
        int x[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
           x[(i+k)%n]= nums[i];
        }
        for(int i=0;i<n;i++) {
            nums[i] = x[i];
            System.out.print(nums[i]);
        }
    }


    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
    }
}
