package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/20
 * @QQ :1136513099
 * @desc : 28. 实现 strStr()
 * https://leetcode-cn.com/problems/implement-strstr/
 */
public class StrStr {

    //解法1：indexOf
    /*public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }*/

    //TODO 解法2：KPM
    public int strStr(String haystack, String needle) {
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new StrStr().strStr("hello", "ll"));//2
        System.out.println(new StrStr().strStr("aaaaa", "bba"));//-1
    }
}
