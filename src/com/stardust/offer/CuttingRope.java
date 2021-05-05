package com.stardust.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/4/27
 * @desc : 14- I. 剪绳子
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。
 * 请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18
 */
public class CuttingRope {

    public int cuttingRope(int n) {
        if (n <= 2)
            return n - 1;
        int i = n / 3, j = n % 3;
        if (j == 0)
            return (int) Math.pow(i, 3);
        if (j == 1)
            return (int) (Math.pow(i, n - 1) * 4);
        return (int) (Math.pow(i, n - 1) * 2);
    }

    public static void main(String[] args) {
        System.out.println(new CuttingRope().cuttingRope(9));

    }
}
