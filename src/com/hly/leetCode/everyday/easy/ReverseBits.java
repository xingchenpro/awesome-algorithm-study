package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/7
 * @desc : 190. 颠倒二进制位
 * https://leetcode-cn.com/problems/reverse-bits/
 */
public class ReverseBits {

    //依次截取 n 的低位，放入 res 的高位
    public int reverseBits(int n) {
        int res = 0, power = 31;
        while (n != 0) {
            //取 n 最右边的数，左移 power位，加到 res
            //(n&1) 取 n 最右边的数，n&1 = n%2 ; << 左移，右边补 0
            res += (n & 1) << power;
            //已经取过了，右移（>>Java无法通过，>>负数会补1 ; >>> 无符号右移，高位补0)
            n = n >>> 1;
            //每次移动 power -1，下次左移减少一位
            power -= 1;
        }
        return res;
    }
    //扩展知识
    //为什么要有“>>”和“>>>”
    //Java 中一个有bai符号 int 类型的数是 32 位，他可以表示的范围是 -2^31 ~ 2^31-1 之间
    //如何表示负数？左边以 1 开始就是负的,这就导致了移位操作符有“有符号”和“无符号”之分
    //区分仅存在于右移的时候。因为需要指明右移以后左边流出的空白以 0 还是 1 补，即移位以后的数是正是负

    public static void main(String[] args) {
        //输入: 00000010100101000001111010011100
        //10000000000000000000000000000000
        //输出: 00111001011110000010100101000000
        System.out.println(new ReverseBits().reverseBits(43261596));//964176192
    }
}
