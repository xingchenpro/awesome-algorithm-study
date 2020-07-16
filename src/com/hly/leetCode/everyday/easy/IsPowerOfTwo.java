package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/15
 * @desc : 231. 2的幂
 * https://leetcode-cn.com/problems/power-of-two/
 */
public class IsPowerOfTwo {

    //解法1：位运算
    public boolean isPowerOfTwo(int n) {
        //负数为 false
        if(n<1)
            return false;
        //2 的幂二进制表示只含有一个 1
        //结果为0说明只有一个1，否则有多个1
        return (n&(n-1))==0;
    }

    public static void main(String[] args) {
        System.out.println(new IsPowerOfTwo().isPowerOfTwo(1));//true
        System.out.println(new IsPowerOfTwo().isPowerOfTwo(16));//true
        System.out.println(new IsPowerOfTwo().isPowerOfTwo(218));//false
    }
}
