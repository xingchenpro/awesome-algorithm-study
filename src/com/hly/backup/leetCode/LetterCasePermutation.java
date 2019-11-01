package com.hly.backup.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/6
 * @QQ :1136513099
 * @desc :todo 784. 字母大小写全排列
 */

/**
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 * 输入: S = "a1b2"
 * 输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
 */

public class LetterCasePermutation {

    public static List<String> letterCasePermutation(String S) {

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
           StringBuilder str = new StringBuilder(S);
            for (int j = 0; j < i; j++) {
                if (isLetter(str.charAt(j))) {
                    if (Character.isUpperCase(str.charAt(j))) {
                        Character.toLowerCase(str.charAt(j));
                    } else {
                        Character.toUpperCase(str.charAt(j));
                        System.out.println(str);
                    }
                }
            }
            strings.add(new String(str));
        }
        return strings;
    }

    public static boolean isLetter(char c) {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }


    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
    }
}
