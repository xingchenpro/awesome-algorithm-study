package com.hly.leetCode.everyday.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/5
 * @desc : 345. 反转字符串中的元音字母
 * https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowels {

    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        char[] chars = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] string = s.toCharArray();
        for (char c : chars) {
            set.add(c);
        }
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (set.contains(string[start]) && set.contains(string[end])) {
                char t = string[start];
                string[start] = string[end];
                string[end] = t;
                start++;
                end--;
            }
            if (!set.contains(string[start]) && start < end) {
                start++;
            }
            if (!set.contains(string[end]) && start < end) {
                end--;
            }
        }
        return new String(string);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseVowels().reverseVowels("hello"));//holle
        System.out.println(new ReverseVowels().reverseVowels("leetcode"));//leotcede
        System.out.println(new ReverseVowels().reverseVowels(""));
    }


}
