package com.hly.leetCode.offer.offer1;

import java.util.*;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/24
 * @QQ :1136513099
 * @desc : AC 面试题50. 第一个只出现一次的字符
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。
 * s = "abaccdeff"
 * 返回 "b"
 * s = ""
 * 返回 " "
 */
public class FirstUniqChar_50 {

    //TreeMap 按照字母表排序
    //ListHashMap 按照插入顺序排序
    //解法1：
    public static char firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), 2);
            }
        }
        Iterator iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            char key = (char) iterator.next();
            if (map.get(key).equals(1)) {
                return key;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {

        System.out.println(firstUniqChar("leetcode"));
    }
}
