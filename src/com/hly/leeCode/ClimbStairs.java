package com.hly.leeCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/19
 */
//70.爬楼梯
public class ClimbStairs {


    public static int climbStairs(int n) {
        if(n==1||n==2)
            return n;
      int fibonacci[] = new int [n+1];
      fibonacci[0] = 1;
      fibonacci[1] = 1;
      for(int i=2;i<=n;i++){
          fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
      }
      return fibonacci[n];
    }

    public static void main(String[] args){
        System.out.println( climbStairs(4));

    }
}
