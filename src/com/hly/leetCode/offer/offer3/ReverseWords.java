package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/21
 * @QQ :1136513099
 * @desc : 面试题58 - I. 翻转单词顺序
 */
public class ReverseWords {

    public static String reverseWords(String s) {

        //这里加上trim()
        String[] strings = s.trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (strings[i].trim().equals("")) {
                continue;
            }
            if (i != 0) {
                //这里是 append
                stringBuilder.append(strings[i].trim()).append(" ");
            } else {
                stringBuilder.append(strings[i].trim());
            }

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world!  "));
        System.out.println(reverseWords("a good   example"));
    }
}
