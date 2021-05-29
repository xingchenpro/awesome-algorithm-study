package com.hly.backup.offer.chapter2;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc :15、二进制中1的个数
 */
/**
 * n      : 10110100
 n-1     : 10110011
 n&(n-1) : 10110000
 */
public class NumberOf1 {


    public int numberOf1(int n){
        int count = 0;
        while (n!=0){
            count++;
            n&=(n-1);
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(new NumberOf1().numberOf1(1));
        System.out.println(new NumberOf1().numberOf1(0x7FFFFFFF));//最大值
        System.out.println(new NumberOf1().numberOf1(0));

        System.out.println(new NumberOf1().numberOf1(0x80000000));//最小值
        System.out.println(new NumberOf1().numberOf1(0xFFFFFFFF));//最小值
    }
}


