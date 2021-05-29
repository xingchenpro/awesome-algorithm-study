package com.hly.backup.leetCode;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/30
 */
//todo 326 3的幂
public class IsPowerOfThree {

    public static boolean isPowerOfThree(int n) {
       if(n<1)
           return false;
       while (n>1){
           if(n%3!=0)
               return false;
           n = n/3;
       }
       return true;
    }

    public static void main(String[] args){
        System.out.println(isPowerOfThree(9));
        System.out.println(isPowerOfThree(10));
    }
}
