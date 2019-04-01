package com.hly.leeCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/4/1
 */
//342. 4的幂
public class IsPowerOfFour {

    public static boolean isPowerOfFour(int num) {
        if(num<1)
            return false;
        while (num!=1){
            if(num%4!=0){
                return false;
            }
            num/=4;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(16));

    }
}
