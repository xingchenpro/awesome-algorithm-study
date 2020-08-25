package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/25
 * @desc : 476. 数字的补数
 * https://leetcode-cn.com/problems/number-complement/
 */
public class FindComplement {

    public int findComplement(int num) {
        int n = num;
        //构造和 num 位数相同的值，并且这个值每一位都是 1
        int c = 0;
        while (n != 0) {
            //右移，统计 num 的二进制共有多少位，比如 5的二进制为 101，共 3 位
            n >>= 1;
            //不断构造 1,11,111，1111,11111
            c = (c << 1) + 1;
        }
        //111 与 101 异或，相同为 0 ，不同为 1，结果为 010
        return num ^ c;
    }

    public static void main(String[] args) {
        System.out.println(new FindComplement().findComplement(5));
    }
}
