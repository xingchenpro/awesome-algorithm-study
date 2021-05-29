package com.hly.offer;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : 面试题14- II. 剪绳子 II
 * https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/
 */
public class CuttingRope2 {

    //解法1：要点，max 为 long，否则溢出
    public int cuttingRope(int n) {
        if (n == 1 || n == 2)
            return 1;
        if (n == 3)
            return 2;
        long max = 1;
        while (n > 4) {
            n -= 3;
            max = (max * 3) % 1000000007;
        }
        max = (max * n) % 1000000007;
        return (int) max;
    }

    public static void main(String[] args) {
        System.out.println(new CuttingRope2().cuttingRope(10));//36
        System.out.println(new CuttingRope2().cuttingRope(120));//953271190
    }
}
