package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/21
 * @QQ :1136513099
 * @desc : 58. 最后一个单词的长度
 * https://leetcode-cn.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] string = s.split(" ");
        if (string.length < 1)
            return 0;
        return string[string.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("Hello World"));//5
        System.out.println(new LengthOfLastWord().lengthOfLastWord(" "));//0
        System.out.println(new LengthOfLastWord().lengthOfLastWord("a"));//1
    }
}
