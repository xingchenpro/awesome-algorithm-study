package com.hly.leetCode.everyday.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/29
 * @desc : 290. 单词规律
 * https://leetcode-cn.com/problems/word-pattern/
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if (pattern.length() != strs.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(strs[i])) {
                    return false;
                } else {
                    map.put(pattern.charAt(i), strs[i]);
                }
            } else {
                if (map.containsKey(pattern.charAt(i)) && (!map.get(pattern.charAt(i)).equals(strs[i]))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new WordPattern().wordPattern("abba", "dog cat cat dog"));//true
        System.out.println(new WordPattern().wordPattern("abba", "dog cat cat fish"));//false
        System.out.println(new WordPattern().wordPattern("aaaa", "dog cat cat dog"));//false

        System.out.println(new WordPattern().wordPattern("abba", "dog dog dog dog"));//false
        System.out.println(new WordPattern().wordPattern("aaa", "dog dog dog dog"));//false
    }
}
