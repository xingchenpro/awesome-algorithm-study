package com.hly.algorithms2018;

import java.util.HashMap;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/5
 */
//todo 有效的字母异位词
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
//s = "anagram", t = "nagaram" true
//s = "rat", t = "car" false
public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
                if (!smap.containsKey(s.charAt(i))) {
                    smap.put(s.charAt(i), 1);
                }
                else{
                    smap.put(s.charAt(i),smap.get(s.charAt(i))+1);
                }
                if (!tmap.containsKey(t.charAt(i))) {
                    tmap.put(t.charAt(i), 1);
                }
                else {
                    tmap.put(t.charAt(i),tmap.get(t.charAt(i))+1);
                }
        }
        //System.err.println(smap);
        //System.err.println(tmap);
        return smap.equals(tmap);

    }

    public static void main(String[] args) {
        System.err.println(isAnagram("anagram", "nagaram"));

    }
}
//smap.equals(tmap);
//1 检查两个对象是否是同一个对象引用，如果是，则显然相等；
//2 检查比较对象是否是Map 类型，且与当前Map对象有相同的size个数
//3 迭代当前对象，并且一一比较当前对象的每个key是否都在被比较对象中，并且值也相等。
//两个Map相等，则必然两个Map有相同的size,相同的keySet，并且每个key对应的value也相等。