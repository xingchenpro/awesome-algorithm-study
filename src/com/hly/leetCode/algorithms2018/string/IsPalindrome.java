package com.hly.leetCode.algorithms2018.string;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/22
 * @QQ :1136513099
 * @desc : 125. 验证回文串
 */
public class IsPalindrome {

    public  static boolean isPalindrome(String s) {


        //^找到非字母，也非数字的字符，用""取代
        if (s.trim().replaceAll("[^a-zA-Z0-9]", "").equals(""))
            return true;
        String str = s.toUpperCase().replaceAll("[^a-zA-Z0-9]", "");

        int i = 0,j = str.length()-1;
        while (i<j&&str.charAt(i)==str.charAt(j)){
            i++;
            j--;
        }
        if(i>=j)
            return true;
        return false;

    }

    public static void main(String[] args){
        System.out.println(isPalindrome("Aba"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }




}
