package com.hly.leetCode.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/2/29
 * @QQ :1136513099
 * @desc : 面试题15. 二进制中1的个数
 * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 * 要点：异或,相同为0，不同为1,&，都是1则为，否则为0
 */
public class HammingWeight_15 {

    //解法1：与运算，全是1才是1，否则为0
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            //每次二进制操作都会减少一个1，每次去掉一个最低位的1
            n &= (n - 1);
            count++;
        }
        return count;
    }
    //解法2：判断第一位是否为1，再逻辑右移>>>

    public static void main(String[] args) {
        //java 前面需要有0，才能是正确结果
        //TODO 1001 无法得到正确结果
        System.out.println(hammingWeight(01001));
        System.out.println(hammingWeight(01011));
        System.out.println(hammingWeight(00000000000000000000000000001011));
        //System.out.println(hammingWeight(00000000000000000000000010000000));

    }
}
