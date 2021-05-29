package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/6/28
 * @desc : 125. 验证回文串
 * https://leetcode-cn.com/problems/valid-palindrome/
 */
public class IsPalindrome125 {

    public boolean isPalindrome(String s) {
        if (s.trim().replaceAll("[^a-zA-Z0-9]", "").equals(""))
            return true;
        //转化为大写，在把非数字字母的转化为空
        String str = s.toUpperCase().replaceAll("[^a-zA-Z0-9]", "");
        int i = 0, j = str.length() - 1;
        //两个条件同时成立
        while (i < j && str.charAt(i) == str.charAt(j)) {
            i++;
            j--;
        }
        if (i >= j)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome125().isPalindrome("A man, a plan, a canal: Panama"));//true
        System.out.println(new IsPalindrome125().isPalindrome("race a car"));//false
    }
}
