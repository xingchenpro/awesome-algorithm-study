package com.hly.algorithms2018;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/3
 */
//todo 只出现一次的数字
//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int num:nums)
            res^=num;
        return res;
    }
    public static void main(String[] args){
            int nums[]={4,1,2,1,2};
            System.err.println(singleNumber(nums));
    }
}
//1.交换律：a ^ b ^ c <=> a ^ c ^ b
//2.任何数于0异或为任何数 0 ^ n => n
//3.相同的数异或为0: n ^ n => 0
//2 ^ 3 ^ 2 ^ 4 ^ 4等价于 2 ^ 2 ^ 4 ^ 4 ^ 3 => 0 ^ 0 ^3 => 3

