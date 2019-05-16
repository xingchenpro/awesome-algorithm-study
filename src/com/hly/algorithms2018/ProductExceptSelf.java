package com.hly.algorithms2018;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/13
 */
//todo 除自身以外数组的乘积
//给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
//不要使用除法，O(n)空间内完成
public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = sum;//第一位数字不做操作
            sum *= nums[i];

        }
        sum = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= sum;//最后一位数字不做操作
            sum *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4};//24,12,8,6
        int[] result = productExceptSelf(nums);
        for (int i : result)
            System.out.print(i + " ");
    }
}
//双层for循环超时