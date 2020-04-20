package com.hly.leetCode.offer.offer2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/5
 * @QQ :1136513099
 * @desc : 面试题14- II. 剪绳子 II
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m] 。请问 k[0]*k[1]*...*k[m] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */
public class CuttingRope2 {

    public int cuttingRope(int n) {
        if (n == 1 || n == 2)
            return 1;
        if (n == 3)
            return 2;
        //sum是long型，int存放不下
        long sum = 1;
        while (n > 4) {
            sum *= 3;
            sum = sum % 1000000007;
            n -= 3;
        }
        return (int) (sum * n % 1000000007);
    }

    public static void main(String[] args) {
        System.out.println(new CuttingRope2().cuttingRope(120));//953271190
    }

}
