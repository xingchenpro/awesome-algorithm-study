package com.hly.algorithms2018;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/4
 */
//todo 验证回文串
//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//replaceAll的参数是regex，即基于规则表达式的替换，比如：可以通过replaceAll("\\d", "*")把一个字符串所有的数字字符都换成星号；
public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        if (s.trim().replaceAll("[^a-zA-Z0-9]", "").equals(""))
            return true;
        String str = s.toUpperCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
        int i = 0, j = str.length() - 1;
        while (i < j&&str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
        }
        if (i >= j)//偶数大于，奇数等于
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome(">,."));
        System.out.println(isPalindrome("aa"));
    }
}
