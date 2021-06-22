package com.stardust.top;

/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/6/22
 * @desc : 7. 整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 */
public class Reverse {

    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            //反转后不能超出范围，所以需要推测在反转前的范围
            if (res > Integer.MAX_VALUE/10 || res < Integer.MIN_VALUE/10) {
                return 0;
            }
            res = res * 10;
            res += x % 10;
            x /= 10;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(new Reverse().reverse(123));
        System.out.println(new Reverse().reverse(-120));
        System.out.println(new Reverse().reverse(-321));

    }


}
