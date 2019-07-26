package com.hly.algorithms2018.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/22
 * @QQ :1136513099
 * @desc : 242. 有效的字母异位词
 */
public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            if (!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),1);
            }else{
                sMap.put(s.charAt(i),sMap.get(s.charAt(i))+1);
            }
            if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),1);
            }else{
                tMap.put(t.charAt(i),tMap.get(t.charAt(i))+1);
            }
        }
        return sMap.equals(tMap);
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));
    }
}
