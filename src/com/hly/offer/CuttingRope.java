package com.hly.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : AC 面试题14- I. 剪绳子
 * https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
 */
public class CuttingRope {

    //解法1：每一段长度为 2 或者 3，n 小于等于 3 为特殊情况
    public int cuttingRope(int n) {
        if (n == 1 || n == 2)
            return 1;
        if (n == 3)
            return 2;
        int max = 1;
        while (n > 4) {
            n -= 3;
            max *= 3;
        }
        max = max * n;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new CuttingRope().cuttingRope(10));//36
        System.out.println(new CuttingRope().cuttingRope(2));//1
    }
}
