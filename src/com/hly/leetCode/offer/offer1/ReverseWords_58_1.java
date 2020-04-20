package com.hly.leetCode.offer.offer1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/30
 * @QQ :1136513099
 * @desc : 面试题58 - I. 翻转单词顺序
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 */
public class ReverseWords_58_1 {

    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = s.trim().split(" ");
        for (int i = strings.length - 1; i >= 0; i--) {
            if (strings[i].trim().equals(""))
                continue;
            if (i != 0) {
                stringBuilder.append(strings[i].trim()).append(" ");
            } else {
                stringBuilder.append(strings[i].trim());
            }
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords(" hello world! "));
        //这个用例由2个空格，会多分一个""
        System.out.println(reverseWords("a good   example"));
    }
}
