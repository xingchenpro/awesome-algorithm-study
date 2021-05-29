package com.hly.backup.leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/13
 */
//3.无重复字符最长子串
public class LengthOfLongestSubstring {

    //滑动窗口,原理？
    public static int lengthOfLongestSubstring(String s) {
       int n  = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0,i=0,j = 0;
        while(i<n&&j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans,j-i);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args){
        //System.out.println(lengthOfLongestSubstring("abcabcbb"));
        //System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwp"));

    }
}
