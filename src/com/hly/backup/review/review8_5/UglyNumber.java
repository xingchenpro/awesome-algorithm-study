package com.hly.backup.review.review8_5;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/2
 * @QQ :1136513099
 * @desc :49、丑数(找到第几个丑数)
 */
public class UglyNumber {

    public boolean isUgly(int n) {
        while (n % 2 == 0)
            n /= 2;
        while (n % 3 == 0)
            n /= 3;
        while (n % 5 == 0)
            n /= 5;
        return (n == 1) ? true : false;
    }


    public int numberOfUgly(int n) {

        int findUgly = 0;
        int i=0;
        while (findUgly<n){
            i++;
            if(isUgly(i)){
                findUgly++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        //System.out.println(new UglyNumber().numberOfUgly(1500));
        System.out.println(new UglyNumber().numberOfUgly(2));
        System.out.println(new UglyNumber().numberOfUgly(3));
        System.out.println(new UglyNumber().numberOfUgly(4));
        System.out.println(new UglyNumber().numberOfUgly(6));
    }
}
