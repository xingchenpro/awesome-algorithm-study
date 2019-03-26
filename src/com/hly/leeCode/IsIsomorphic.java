package com.hly.leeCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/26
 */
//todo 205. 同构字符串
public class IsIsomorphic {


    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (sMap.get(c1) == null) {
                sMap.put(c1, 1);
            } else {
                sMap.put(c1, sMap.get(c1) + 1);
            }
            if (tMap.get(c2) == null) {
                tMap.put(c2, 1);
            } else {
                tMap.put(c2, tMap.get(c2) + 1);
            }
            if (sMap.get(c1) != tMap.get(c2))
                return false;
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(isIsomorphic("cvv", "abb"));
        System.out.println(isIsomorphic("cvv", "vvb"));

    }
}
