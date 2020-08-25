package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/24
 * @desc : 461. 汉明距离
 * https://leetcode-cn.com/problems/hamming-distance/
 */
public class HammingDistance {
    //异或：相同为0，不同为1
    public int hammingDistance(int x, int y) {
        //得到二进制中1的个数
       return Integer.bitCount(x^y);
    }
    public static void main(String[] args){
        System.out.println(new HammingDistance().hammingDistance(1, 4));
    }

}
