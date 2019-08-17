package com.hly.review.review8_3.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc : 14、剪绳子
 */
public class Cutting {

    public int cutting(int n) {
        if (n < 2)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int timesOf3 = n / 3;
        if (n - timesOf3 * 3 == 1)
            timesOf3 -= 1;
        int timesOf2 = (n - timesOf3 * 3) / 2;
        return (int) (Math.pow(2, timesOf2) + Math.pow(3, timesOf3));

    }
}
