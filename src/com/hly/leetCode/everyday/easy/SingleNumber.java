package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/6/28
 * @desc : 136. 只出现一次的数字
 * https://leetcode-cn.com/problems/single-number/
 */
public class SingleNumber {

    //解法1：异或(相同为 0 ,不同为 1
    //1、任何数和 0 做异或,结果是原来的数,a⊕0=a
    //2、任何数和自身做异或,结果为0,a⊕a=0
    //3、异或运算满足交换律和结合律,即 a⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(new int[]{4, 1, 2, 1, 2}));//4
        System.out.println(new SingleNumber().singleNumber(new int[]{2, 2, 1}));//1
        System.out.println(new SingleNumber().singleNumber(new int[]{1, 0, 1}));//0
    }
}
