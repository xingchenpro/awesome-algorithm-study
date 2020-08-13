package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/13
 * @desc : 383. 赎金信
 * https://leetcode-cn.com/problems/ransom-note/
 */
public class CanConstruct {

    //a-z 97-122
    //ransom 能不能由第二个字符串 magazines 里面的字符构成
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] h = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            h[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            h[ransomNote.charAt(i) - 'a']--;
            //小于 0，说明，magazine 有的 ransomNote 没有,或者 magazine 不够
            if (h[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(new CanConstruct().canConstruct("a", "b"));//false
        System.out.println(new CanConstruct().canConstruct("aa", "ab"));//false
        System.out.println(new CanConstruct().canConstruct("aa", "aab"));//true
        System.out.println(new CanConstruct().canConstruct("aab", "baa"));//true
        System.out.println(new CanConstruct().canConstruct("aa", "a"));//true
    }

}
