package com.hly.algorithms2018.dp;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/21
 * @QQ :1136513099
 * @desc : 279. 完全平方数
 */
public class NumSquares {

    public static int numSquares(int n) {

        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] =1;
        for(int i=2;i<=n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=Math.sqrt(i);j++){
                if(j*j==i){
                    min=1;
                    break;
                }
                min=Math.min(min,dp[j*j]+dp[i-j*j]);
            }
            dp[i] =min;
        }

        return dp[n];
    }


    public static void main(String[] args){
        System.out.println(numSquares(12));
        System.out.println(numSquares(13));
        System.out.println(numSquares(19));
    }
}
