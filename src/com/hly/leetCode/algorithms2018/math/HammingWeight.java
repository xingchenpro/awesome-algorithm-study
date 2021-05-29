package com.hly.leetCode.algorithms2018.math;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/21
 * @QQ :1136513099
 * @desc : 191. 位1的个数
 */
public class HammingWeight {
    public static int hammingWeight(int n) {
        int sum = 0;
        while (n!=0){
            sum++;
            n&=(n-1);
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }

}
