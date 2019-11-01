package com.hly.backup.leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/30
 */
//todo 345 反转字符串中的元音字母
public class ReverseVowels {

    public static String reverseVowels(String s) {

        Set<Character> set = new HashSet<>();
        char[] chars = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char c : chars)
            set.add(c);
        int start = 0, end = s.length() - 1;
        char[] arr = s.toCharArray();
        while (start < end) {
            if (set.contains(arr[start]) && set.contains(arr[end])) {
                char c = arr[start];
                arr[start] = arr[end];
                arr[end] = c;
                start++;//注意遗漏
                end--;
            }
            if (!set.contains(arr[start]) && start < end)//start < end 条件
                start++;
            if (!set.contains(arr[end]) && start < end)
                end--;
        }
        return new String(arr);
    }


    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("race car"));//"race car"
    }
}
