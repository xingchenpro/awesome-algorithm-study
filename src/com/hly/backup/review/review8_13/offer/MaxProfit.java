package com.hly.backup.review.review8_13.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/2
 * @QQ :1136513099
 * @desc :63、股票的最大利润
 */
public class MaxProfit {

    public int maxProfit(int prices[]) {
        if (prices == null || prices.length == 0)
            return -1;
        int min = prices[0];
        int maxDiff = prices[1] - min;
        for(int i=2;i<prices.length;i++){
            if(prices[i-1]<min)
                min= prices[i-1];
            int curr = prices[i] - min;
            if(curr>maxDiff)
                maxDiff = curr;
        }
        return maxDiff;
    }

    //思路：买入价格越低，获得利润越大
    public static void main(String[] args) {
        System.out.println(new MaxProfit().maxProfit(new int[]{9, 11, 8, 5, 7, 12, 16, 14}));
    }
}
