package com.hly.leetCode.leetCode.medium;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/28
 * @QQ :1136513099
 * @desc : 面试题56 - I. 数组中数字出现的次数
 */
public class SingleNumbers {

    //解法1：分组异或，充分利用了异或的性质
    //思路：
    //异或：相同为 0，不同为1
    //数组里面所有数异或为两个目标值的异或，因为两个数不同，结果不为0
    //假设数组异或的二进制结果为10010，那么说明这两个数从右向左数第2位是不同的
    //那么可以根据数组里面所有数的第二位为0或者1将数组划分为2个数组
    //这样做可以将目标数必然分散在不同的数组中，而且相同的数必然落在同一个数组中
    //这两个数组里面的数各自进行异或，得到的结果就是答案
    public static int[] singleNumbers(int[] nums) {
        int k = 0;
        //找出两个不同的数异或的结果
        for (int num : nums) {
            k ^= num;
        }
        //k为两个不同的数异或的结果，异或：相同为 0，不同为1，找出 k位中不同的数 1
        //mask = 00001
        int mask = 1;
        //& 都是1才是1，为的是找出 k中不同的数1
        //假设 k = 10010
        while ((k & mask) == 0) {
            //左移一位
            mask <<= 1;
        }
        System.out.println("mask:" + mask);
        //假设 mask 最终结果为 00010
        int a = 0;
        int b = 0;
        for (int num : nums) {
            //& 都是1才是1 ，根据奇偶分组，判断最后一个是否为 1 来辨别奇偶
            //由于mask位为1的数，将两个不同的值划分到两个数组
            //偶数
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                //奇数
                b ^= num;
            }
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 4, 6};
        int[] nums2 = {1, 2, 10, 4, 1, 4, 3, 3};
        int[] res = singleNumbers(nums2);
    }

}
