package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/11
 * @desc : 204. 计数质数
 * https://leetcode-cn.com/problems/count-primes/
 */
public class CountPrimes {

    //解法1：优化暴力法
    public int countPrimes(int n) {
        if (n < 3)
            return 0;
        int count = 1;
        // 2 的 n 次方都不是质数
        for (int i = 3; i < n; i += 2) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int m) {
        //对于数 m，如果用 2 到根号m(包含边界) 的正数去除，都无法整除，则 n 为质数
        for (int i = 3; i <= Math.sqrt(m); i += 2) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    //TODO 解法2：厄拉多塞筛法

    public static void main(String[] args) {
        System.out.println(new CountPrimes().countPrimes(10));
    }
}
