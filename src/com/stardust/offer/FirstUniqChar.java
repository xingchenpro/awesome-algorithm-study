package com.stardust.offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/5/30
 * @desc : 50. 第一个只出现一次的字符
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 */
public class FirstUniqChar {

    public char firstUniqChar(String s) {
        if ("".equals(s.trim())) {
            return ' ';
        }
        //按顺序保存
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue().equals(1)) {
                return m.getKey();
            }
        }
        return ' ';
    }

    public static void main(String[] args) {

        System.out.println(new FirstUniqChar().firstUniqChar("abaccdeff"));//b
        System.out.println(new FirstUniqChar().firstUniqChar(""));//b
        System.out.println(new FirstUniqChar().firstUniqChar("leetcode"));//l
    }


}
