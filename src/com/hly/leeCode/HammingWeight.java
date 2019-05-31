package com.hly.leeCode;
/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/27
 */
//todo 191.位1的个数
public class HammingWeight {
    //如果是偶数，& 两个操作数中位都为1，结果为1，否则为0
    //>>>    :    无符号右移，忽略符号位，空位都以0补齐
    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count+= n&1;
            n >>>= 1;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
}









