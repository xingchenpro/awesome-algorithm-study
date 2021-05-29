package com.hly.leetCode.offer.offer1;

/**
 * @author :hly
 *
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
    public static int hammingWeight2(int n) {
        return -1;
    }

    public static void main(String[] args) {
        //TODO 1001 运行无法得到正确结果,LeetCode 提交正确，因为1开头为负数
        System.out.println(hammingWeight(00001001));
        System.out.println(hammingWeight(00001011));
        System.out.println(hammingWeight(00000000000000000000000000001011));
        System.out.println(hammingWeight(9));
        //System.out.println(hammingWeight2(1001));//0110->0111,

    }
    //PS :二进制里，用0或1表示正负，最高位1代表负数，最高位0代表正数
    //十进制转二进制，正数直接转换，负数：绝对值转二进制->求反码->将反码加1

}
