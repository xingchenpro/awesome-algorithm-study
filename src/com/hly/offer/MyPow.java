package com.hly.offer;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : 面试题16. 数值的整数次方
 * https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/submissions/
 */
public class MyPow {

    //解法1：快速幂
    //https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/solution/mian-shi-ti-16-shu-zhi-de-zheng-shu-ci-fang-kuai-s/
    public double myPow(double x, int n) {
        if (x == 0)
            return 0;
        long b = n;
        double res = 1.0;
        //当n<0时，把问题转化为n>0的范围
        if (b < 0) {
            b = -b;
            x = 1 / x;
        }
        //n为0时跳出
        while (b > 0) {
            //如果是奇数
            if ((b & 1) == 1)
                res *= x;
            //通过 x^2,把 n 的幂降为 n/2,直至降为 0,如 2^8 = 2^(2*4) = 2^4
            x *= x;
            //幂右移,相当于 b/2
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(new MyPow().myPow(2.00000, 3));
        System.out.println(new MyPow().myPow(2.00000, 10));
        //定义局部变量
        System.out.println(new MyPow().myPow(2.00000, -2));
        //n为0的情况
        System.out.println(new MyPow().myPow(0.44538, 0));//1.0
    }


}
