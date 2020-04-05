package com.hly.leetCode.offer2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/5
 * @QQ :1136513099
 * @desc : 面试题14- I. 剪绳子
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m] 。
 * 请问 k[0]*k[1]*...*k[m] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 思路：
 * 绳子切得段数越多，成绩越大，3做因数比2更优
 * 不断减去长度为3，sum累乘
 * 把绳子切为3的片段，最后一段绳子的长度可能为0,1,2三种情况
 * 2或3的话直接用sum乘最后的结果
 * 如果再减一次长度为1，需要把最后的3和1替换为2和2因为2*2>3*1
 *
 */
public class CuttingRope {

    public int cuttingRope(int n) {
        if (n == 1 || n == 2)
            return 1;
        if (n == 3)
            return 2;
        int sum = 1;
        while (n > 4) {
            sum *= 3;
            n -= 3;
        }
        return sum * n;
    }

}
