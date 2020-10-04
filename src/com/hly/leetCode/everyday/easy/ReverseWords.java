package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/10/4
 * @desc : 557. 反转字符串中的单词 III
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWords {

    public String reverseWords(String s) {
        String [] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<strings.length;i++) {
            sb.append(reverse(strings[i].toCharArray()));
            if(i<strings.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private String reverse(char [] chars){
        int i = 0,j = chars.length-1;
        while (i<j){
            char t = chars[i];
            chars[i] = chars[j];
            chars[j] = t;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWords().reverseWords("Let's take LeetCode contest"));//s'teL ekat edoCteeL tsetnoc

    }
}
