package com.hly.backup.leetCode;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/30
 */
//344 字符串反转
public class ReverseString {

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char c = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = c;
        }
    }

    public static void main(String[] args) {

        char s[] = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        for (char c : s)
            System.out.print(c + " ");
    }
}
