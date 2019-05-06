package com.hly.algorithms2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/5
 */
//AC 字符串中的第一个唯一字符
public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        if(s.trim().equals(""))
            return -1;
        List<Character> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
                list.add(s.charAt(i));
            } else {
                list.remove((Character)s.charAt(i));
            }
        }
        if(list.size()==0)
            return -1;
        return s.indexOf(list.get(0));
    }


    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
