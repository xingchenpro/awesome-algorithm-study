package com.stardust.top;

import java.util.HashSet;
import java.util.Set;

/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/6/17
 * @desc : *3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LengthOfLongestSubstring {

    //解法一：滑动窗口
    public int lengthOfLongestSubstring(String s) {

        //哈希，保存不重复的字符
        Set<Character> set = new HashSet<>();
        int n = s.length();
        //右指针，初始值为 -1，每移动之前
        int rk = -1, ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                //左指针向右移动一格，移除一格字符
                set.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !set.contains(s.charAt(rk + 1))) {
                //如果字符不重复，不断移动右指针
                set.add(s.charAt(rk + 1));
                rk++;
            }
            //每次循环更新最大值
            ans = Math.max(ans, rk - i + 1);
        }

        return ans;
    }


    public static void main(String[] args) {
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb"));//3
    }

}
