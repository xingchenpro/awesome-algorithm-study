package com.stardust.top;

/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/6/21
 * @desc : 5. 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 */
public class LongestPalindrome {

    //滑动窗口
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 1) {
            return s;
        }
        int size = n;
        while (size >= 1) {
            int left = 0;
            while (left + size <= n) {
                String t = s.substring(left, left + size);
                if (isPalind(t)) {
                    return t;
                }
                left++;
            }
            size--;
        }

        return "";
    }

    private boolean isPalind(String s) {
        int i = 0, j = s.length() - 1;
        //i<j,否则如果是回文，会往回倒，溢出
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }
        //奇数个数，i=j,偶数个数,i>j。如果不是回文，循环就停止了，i永远小于j
        return i >= j;
    }

    //动态规划

    public static void main(String[] args) {

        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.isPalind("abcba"));
        System.out.println(longestPalindrome.isPalind("abcbc"));

        System.out.println(longestPalindrome.longestPalindrome("babad"));//bab
        System.out.println(longestPalindrome.longestPalindrome("cbbd"));//bb
        System.out.println(longestPalindrome.longestPalindrome("bb"));//bb

    }

}
