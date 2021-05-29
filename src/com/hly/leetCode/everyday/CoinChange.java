package com.hly.leetCode.everyday;

import java.util.Arrays;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/8
 * @QQ :1136513099
 * TODO @desc : 322. 零钱兑换
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 */
public class CoinChange {

    //解法1：
    public static int coinChange(int[] coins, int amount) {
        if (coins.length == 0) {
            return -1;
        }
        //各个价值的钱包
        int[] dp = new int[amount + 1];
        //dp[j] ，当价值为j时，所需要的最少硬币数
        Arrays.fill(dp, 1, dp.length, Integer.MAX_VALUE);
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }

        if (dp[amount] != Integer.MAX_VALUE) {
            return dp[amount];
        }
        return -1;
    }

    public static void main(String[] args) {
       int aoins[]={1, 2, 5};
        System.out.println(coinChange(aoins,11));
    }
}
