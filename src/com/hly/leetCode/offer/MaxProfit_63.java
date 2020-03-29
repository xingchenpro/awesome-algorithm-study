package com.hly.leetCode.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/29
 * @QQ :1136513099
 * @desc : 面试题63. 股票的最大利润
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 */
public class MaxProfit_63 {


    public static int maxProfit(int[] prices) {
        if (prices.length <= 1)
            return 0;
        int max = Integer.MIN_VALUE;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            //记录下最小股票价格
            if (min > prices[i]) {
                min = prices[i];
            }
            //如果最大收益小于当前股价减去最小股价格，则换掉
            if (max < prices[i] - min) {
                max = prices[i] - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
