package com.hly.algorithms2018.math;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/22
 * @QQ :1136513099
 * @desc : 172. 阶乘后的零
 */
public class TrailingZeroes {

    public static int trailingZeroes(int n) {
        int count = 0;
        while (n >0) {
            count+=n/5;
            n/=5;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(trailingZeroes(5));
        System.out.println(trailingZeroes(3));
    }
}
