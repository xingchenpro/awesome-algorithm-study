package com.hly.test.baiou;

import java.text.Format;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/26
 * @QQ :1136513099
 * @desc :
 */
public class ToHMS {


    public static String toHMS(int seconds) {

        int s = seconds, m = 0, h = 0;
        while (s > 60) {
            m += 1;
            s -= 60;
        }
        while (m > 60) {
            h += 1;
            m -= 60;
        }
        return (h < 9 ? "0" + h : h )+ ":" + (m<9 ? "0" + m : m )+ ":" + (s<9 ? "0" + s : s);
    }

    public static void main(String[] args) {
        System.out.println(toHMS(4019));
        System.out.println(toHMS(2019));
    }
}
