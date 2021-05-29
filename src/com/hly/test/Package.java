package com.hly.test;

import java.util.Arrays;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/14
 * @desc : 题目1
 */
public class Package {

    public static int buy(int budget, int[] prices) {
        if (prices == null || prices.length <= 0 || budget <= 0)
            return -1;
        Arrays.sort(prices);
        int res = 0;
        for (int price : prices) {
            res += price;
            if (res > budget) {
                return res - price;
            }
            if (res == budget) {
                return res;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] prices = {50, 42, 9, 15, 105, 63, 14, 30};
        System.out.println(buy(188, prices));
    }
}
