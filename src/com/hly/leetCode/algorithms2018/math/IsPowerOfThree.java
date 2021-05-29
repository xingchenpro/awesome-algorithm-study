package com.hly.leetCode.algorithms2018.math;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/21
 * @QQ :1136513099
 * @desc AC 326. 3的幂:
 */
public class IsPowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n==0)
            return false;
        while (n%3==0){
            n/=3;
        }
        if(n==1)
            return true;
        return false;

    }

    public static void main(String[] args){
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(4));
    }

}
