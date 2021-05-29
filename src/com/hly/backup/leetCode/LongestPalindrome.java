package com.hly.backup.leetCode;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/3
 * @QQ :1136513099
 * @desc :
 */
//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
//输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
public class LongestPalindrome {


    //(O^2)超时
    public static String longestPalindrome(String s) {
        if(s.trim().equals("")||s.length()==1)
            return s.trim();
        String str = null;
        int length = 0;
        for(int i = 0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){//这里需要加1，s.substring(i,length())
                if(palindrome(s.substring(i,j))){
                    String temp = s.substring(i,j);
                    if(temp.length()>length){
                        length =temp.length();
                        str = temp;
                    }
                }
            }
        }
        return str;
    }


    public static boolean palindrome(String str){
        int i=0,j = str.length()-1;
        while (i<j&&str.charAt(i)==str.charAt(j)){
            i++;
            j--;
        }
        if(i>=j)
            return true;
        return false;
    }

    public static void main(String[] args){
        System.out.println(longestPalindrome("babad"));//"bab","aba"
        System.out.println(longestPalindrome("cbbd"));//"bb"
        System.out.println(longestPalindrome("c"));//"c"
        System.out.println(longestPalindrome("bb"));//"bb"
    }
}
