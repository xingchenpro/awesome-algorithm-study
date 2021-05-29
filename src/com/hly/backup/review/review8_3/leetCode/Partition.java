package com.hly.backup.review.review8_3.leetCode;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/3
 * @QQ :1136513099
 * @desc :todo 分割回文串
 */
public class Partition {


    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return false;
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }
        if (i >= j)
            return true;

        return false;
    }
}
