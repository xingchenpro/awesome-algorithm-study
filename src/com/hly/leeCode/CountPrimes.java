package com.hly.leeCode;
/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/25
 */
//todo 204. 计数质数
public class CountPrimes {

    //厄拉多塞筛法
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        } else {
            int[] c = new int[n];
            c[1] = 1;
            for (int i = 2; i <= (int) Math.pow(n, 0.5); i++) {
                if (c[i] == 0) {
                    for (int j = i * i; j < n; j = j + i) {
                        c[j] = 1;
                    }
                }
            }
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (c[i] == 0) {
                    sum++;
                }
            }
            return sum;
        }
    }

    //超时
    /*public static int countPrimes(int n) {
        if (n <= 2)
            return 0;
        int count = 1;
        boolean flag = false;
        for (int i = 3; i < n; i += 2) {
            flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }*/

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
