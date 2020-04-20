package com.hly.leetCode.offer.offer1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/29
 * @QQ :1136513099
 * @desc : 面试题58 - II. 左旋转字符串
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，
 * 该函数将返回左旋转两位得到的结果"cdefgab"。
 */
public class ReverseLeftWords_58_2 {

    //解法1:字符串切割再拼接
    public static String reverseLeftWords(String s, int n) {
        if (s == null)
            return null;
        String s1 = s.substring(0, n);
        String s2 = s.substring(n, s.length());
        return s2 + s1;

    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 2));
        System.out.println(reverseLeftWords(null, 2));
    }
}
