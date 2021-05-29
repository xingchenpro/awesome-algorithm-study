package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/9/27
 * @desc : 521. 最长特殊序列 Ⅰ
 * https://leetcode-cn.com/problems/longest-uncommon-subsequence-i/
 */
public class FindLUSlength {

    //若字符串a和b相同，返回-1
    //若字符串a和b不相同，返回a,b中较长的长度
    public int findLUSlength(String a, String b) {
        if(a.equals(b))
            return -1;
        return Math.max(a.length(),b.length());
    }
    public static void main(String[] args){
        System.out.println(new FindLUSlength().findLUSlength("aba", "cdc"));
    }
}
