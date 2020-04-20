package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/20
 * @QQ :1136513099
 * @desc : 面试题10- I. 斐波那契数列
 */
public class Fib {

    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int a = 0,b =1;
        for(int i = 2;i<=n;i++){
            //记得取余
            int c= (a+b)%1000000007;
            a = b;
            b = c;
        }
        return b;
    }

}
