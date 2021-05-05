package com.stardust.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/4/29
 * @desc : 15. 二进制中1的个数
 * 请实现一个函数，输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。
 * 例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 */
public class HammingWeight {

    //解法1：& 运算，两个同时为 1，结果才为 1
    //1011
    //1010
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            //每次 & 运算都能消除一个 1，最后结果为 0
            n &= (n - 1);
            res++;
        }
        return res;
    }

    //解法2：位运算，无符号右移，思想：&，同时为 1 ，才是 1



    public static void main(String[] args) {
        System.out.println(new HammingWeight().hammingWeight(00000000000000000000000000001011));//3
        System.out.println(new HammingWeight().hammingWeight(00000000000000000000000010000000));//1
        //System.out.println(new HammingWeight().hammingWeight(11111111111111111111111111111101));//31
    }


}
