package com.hly.review.review8_13.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/13
 * @QQ :1136513099
 * @desc :
 */
public class TrailingZeroes {

    public int trailingZeroes(int n) {
       int count = 0;
       while (n>0){
           count+=n/5;
           n/=5;
       }
       return count;
    }
}
