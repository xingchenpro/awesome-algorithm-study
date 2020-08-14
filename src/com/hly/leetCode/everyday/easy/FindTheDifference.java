package com.hly.leetCode.everyday.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/14
 * @desc : 389. 找不同
 * https://leetcode-cn.com/problems/find-the-difference/
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        int[] h = new int[26];
        for (int i = 0; i < t.length(); i++) {
            h[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            h[s.charAt(i) - 'a']--;
        }
        for (int i = 0; i < t.length(); i++) {
            if (h[t.charAt(i) - 'a'] > 0) {
                return t.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(new FindTheDifference().findTheDifference("abcd", "abcde"));
    }
}
