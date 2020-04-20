package com.hly.leetCode.leetCode.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/21
 * @QQ :1136513099
 * @desc : 7. 整数反转
 * https://leetcode-cn.com/problems/reverse-integer/
 */
public class Reverse {

    public static int reverse(int x) {
        //long 类型
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        if (res > 2147483647 || res < -2147483648) {
            return 0;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

}
