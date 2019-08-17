package com.hly.review.review8_3.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/3
 * @QQ :1136513099
 * @desc : 验证回文串
 */
public class IsPalindrome {

    public boolean isPalindrome(String s) {
        if (s.trim().replaceAll("[^a-zA-Z0-9]", "").equals(""))
            return true;
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }
        if (i >= j)
            return true;

        return false;
    }
    public static void main(String[] args){
        System.out.println(new IsPalindrome().isPalindrome("race a car"));
    }

}
