package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/7
 * @desc : 191. 位1的个数
 * https://leetcode-cn.com/problems/number-of-1-bits/
 */
public class HammingWeight {

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            //n &1 = n%2 ; 判断最右边的数
            if ((n & 1) == 1) {
                count++;
            }
            //Java 都要无符号右移，见 190 题
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new HammingWeight().hammingWeight(11));//00000000000000000000000000001011 ; 3
    }
}
