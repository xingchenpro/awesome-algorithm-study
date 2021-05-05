package com.stardust.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/4/29
 * @desc : 14- II. 剪绳子 II
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m - 1] 。
 * 请问 k[0]*k[1]*...*k[m - 1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 */
public class CuttingRopeII {

    public int cuttingRope(int n) {
        if (n <= 3)
            return n - 1;
        long res = 1;

        while (n > 4) {
            res = res * 3 % 1000000007;
            n -= 3;
        }
        return (int) (res * n % 1000000007);

    }

    public static void main(String[] args) {

        System.out.println(new CuttingRopeII().cuttingRope(2));//1
        System.out.println(new CuttingRopeII().cuttingRope(10));//36
        System.out.println(new CuttingRopeII().cuttingRope(120));//953271190
    }


}
