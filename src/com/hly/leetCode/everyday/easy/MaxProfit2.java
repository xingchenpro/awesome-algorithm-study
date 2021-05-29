package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/6/28
 * @desc : 122. 买卖股票的最佳时机 II
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class MaxProfit2 {

    //解法1：峰谷法(找到连续等峰谷)
    public int maxProfit(int[] prices) {
        int i = 0;
        int maxPrices = 0;
        //峰值
        int peak = 0;
        //谷值
        int valley = 0;
        while (i < prices.length - 1) {
            //如果当前值大于后面的值，递增，直到找到谷值
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            //找到峰值
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            //峰值减去谷值
            maxPrices += peak - valley;
        }
        return maxPrices;
    }

    public static void main(String[] args) {
        System.out.println(new MaxProfit2().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));//7
    }

}
