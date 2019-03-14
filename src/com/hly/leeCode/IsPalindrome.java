package com.hly.leeCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/14
 */
public class IsPalindrome {

    public static boolean isPalindrome(int x) {

        if(x<0||x%10==0&&x!=0){
            return false;
        }

        int revertedNumber = 0;

        while (x>revertedNumber){
            revertedNumber = revertedNumber*10+x%10;
            x/=10;
        }
        return x==revertedNumber||x == revertedNumber/10;// /10 是奇数情况
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(12321));
    }
}
