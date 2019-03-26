package com.hly.leeCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/24
 */
//136.只出现一次的数字
public class SingleNumber {
    //异或，相同为0，不同为1. 异或同一个数两次，原数不变。
    //有序列表 任何数与自身异或结果为0: a ^ a = 0
    //有序列表 0与任何数异或结果不变: 0 ^ a = a
    //有序列表 遵循交换律: a ^ b = b ^ a
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num:nums){
            res ^=num;
            System.out.println("res:"+res);
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {4, 1, 2, 1, 2};
        int nums2[] = {2, 2, 1};
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(nums));
        System.out.println(singleNumber.singleNumber(nums2));
    }
}
