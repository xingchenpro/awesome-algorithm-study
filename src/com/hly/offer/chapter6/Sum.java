package com.hly.offer.chapter6;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/2
 * @QQ :1136513099
 * @desc :64、不用循环求和
 */
public class Sum {

    public int  sum(int n){
        int sum = n;
        if (n>0)
        return sum+sum(n-1);
        return 0;
    }

    public static void main(String[] args){
        System.out.println(new Sum().sum(100));
    }
}
