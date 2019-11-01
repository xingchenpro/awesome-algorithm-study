package com.hly.leetCode.algorithms2018.math;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/21
 * @QQ :1136513099
 * @desc : 204. 计数质数
 */
public class CountPrimes {

    //取模法双层循环都从3开始每次加2才不会超时
    public static int countPrimes(int n) {
        if(n<3)
            return 0;
        int count = 1;
        for (int i = 3; i < n; i+=2) {
            boolean flag = true;
            for (int j = 3; j <=Math.sqrt(i); j+=2) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
        System.out.println(countPrimes(2));
    }
}
