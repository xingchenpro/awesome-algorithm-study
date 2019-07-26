package com.hly.algorithms2018.arrays;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/25
 * @QQ :1136513099
 * @desc :
 */
public class MaxProduct {

    public int maxProduct(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int x[] = new int[nums.length];
        int y[] = new int[nums.length];
        int z[] = new int[nums.length];
        x[0] = nums[0];
        y[0] = nums[0];
        z[0] = nums[0];
        //x保存每一步的较大值，y保存每一步的较小值
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                x[i] = Math.max(nums[i] * x[i - 1], nums[i]);//xi为较大值
                y[i] = Math.min(nums[i] * y[i - 1], nums[i]);//yi为较小值
            }else{
                x[i] = Math.max(nums[i]*y[i-1],nums[i]);//当numi为负数时，较大值为numi乘较小值
                y[i] = Math.min(nums[i]*x[i-1],nums[i]);//较小值为numi乘较大值
            }
            //选出当前一步的较大值
            z[i] = Math.max(z[i-1],x[i]);
        }
        return z[nums.length-1];
    }

    public static void main(String[] args) {
        System.out.println(new MaxProduct().maxProduct(new int[]{2, 3, -2, 4}));
        System.out.println(new MaxProduct().maxProduct(new int[]{-2, 0, -1}));
    }
}
