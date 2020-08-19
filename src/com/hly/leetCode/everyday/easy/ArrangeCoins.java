package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/18
 * @desc : 441. 排列硬币
 * https://leetcode-cn.com/problems/arranging-coins/
 */
public class ArrangeCoins {

    public int arrangeCoins(int n) {
        //long
        long count = 0;
        for (int i = 1; i <= n; i++) {
            count += i;
            if (count > n) {
                return i - 1;
            }
            if (count == n) {
                return i;
            }
        }
        //当 n 为 0
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new ArrangeCoins().arrangeCoins(5));//2
        System.out.println(new ArrangeCoins().arrangeCoins(8));//3
        System.out.println(new ArrangeCoins().arrangeCoins(1));//1
        System.out.println(new ArrangeCoins().arrangeCoins(0));//0
        System.out.println(new ArrangeCoins().arrangeCoins(2147483647));//65535
    }


}
