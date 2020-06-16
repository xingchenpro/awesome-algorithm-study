package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/16
 * @QQ :1136513099
 * @desc : 14. 最长公共前缀
 * https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {

    //解法1：纵向遍历
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                //i 为某一字符串的最后一个索引,这个字符串的长度是 i,没必要遍历了;第 j 个字符串的第 i 个数不等于 c (第一遍是所有字符串的第 0 个数是否等于第一个字符串的第 0 个数)
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    //遇到不等于的列，直接返回 0 到 i-1
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog", "racecar", "car"});
    }
}
