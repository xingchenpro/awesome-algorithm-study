package com.hly.other;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/20
 * @QQ :1136513099
 * @desc :
 */
public class MaxProfit {

    //https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/
    public static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            if (max < prices[i] - min) {
                max = prices[i] - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {2, 6, 1, 4, 8};
        System.out.println(maxProfit(prices));
    }
}
