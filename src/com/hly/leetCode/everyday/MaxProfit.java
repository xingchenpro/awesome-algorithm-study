package com.hly.leetCode.everyday;

import java.util.Arrays;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/9
 * @QQ :1136513099
 * @desc : 121. 买卖股票的最佳时机
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 */
public class MaxProfit {

    //动态规划，第 i 天的最大收益 = max{第i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
    public static int maxProfit(int[] prices) {
        if (prices.length <= 1)
            return 0;
        int min = prices[0];
        int[] dp = new int[prices.length];
        for (int i = 1; i < dp.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            dp[i] = Math.max(dp[i - 1], prices[i] - min);
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {1, 2};
        System.out.println(maxProfit(prices2));

    }


}
