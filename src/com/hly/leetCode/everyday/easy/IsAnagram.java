package com.hly.leetCode.everyday.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/22
 * @desc : 242. 有效的字母异位词
 * https://leetcode-cn.com/problems/valid-anagram/
 */
public class IsAnagram {

    //解法1：计数
    //A-Z 65-90
    //a-z 97-122
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int [] counter = new int[26];
        for (int i=0;i<s.length();i++){
            counter[s.charAt(i)-'a']++;
            System.out.println(s.charAt(i)-'a');
            counter[t.charAt(i)-'a']--;
        }
        for (int count :counter){
            if(count!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(new IsAnagram().isAnagram("anagram", "nagaram"));
        //System.out.println(new IsAnagram().isAnagram("rat", "car"));
    }
}
