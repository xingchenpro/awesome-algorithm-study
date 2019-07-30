package com.hly.offer.chapter2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc : 14、剪绳子
 */
public class Cutting {

    //贪心算法
    public int cutting(int length) {
        if (length < 2)
            return 0;
        if (length == 2)
            return 1;
        if (length == 3)
            return 2;
        //尽可能减去长度为3的绳子段
        int timesOf3 = length / 3;
        //当绳子最后剩下的长度为4的时候，不能再减去长度为3的生字段
        //此时最好的方法是把绳子剪成长度为2的绳子段
        if (length - timesOf3 * 2 == 1)
            timesOf3 -= 1;
        int timesOf2 = (length - timesOf3 * 3) / 2;
        return (int) (Math.pow(3, timesOf3) * Math.pow(2, timesOf2));
    }

    //动态规划
    public int cutting2(int length) {
        int[] dp = new int[length + 1];
        dp[1] = 1;
        for(int i=2;i<=length;i++){
            for(int j=1;j<i;j++){

            }
        }
        return dp[length];
    }

    public static void main(String[] args) {
        System.out.println(new Cutting().cutting(8));
        System.out.println(new Cutting().cutting(0));
        System.out.println(new Cutting().cutting(1));
        System.out.println(new Cutting().cutting(2));
        System.out.println(new Cutting().cutting(3));
        System.out.println(new Cutting().cutting(4));
    }
}
