package com.hly.backup.review.review8_3.offer;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc :10、斐波那契数列 F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 * 1、1、2、3、5、8、13、21、34
 */
public class Fibonacci {

    public int fi(int n){

        int res [] =new int[n+1];
        res[1]=1;
        res[2]=1;
        for(int i=3;i<=n;i++){
            res[i] = res[i-2]+res[i-1];
        }
        return res[n];
    }
    public static void main(String[] args){
        System.out.println(new Fibonacci().fi(8));
    }

}
