package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/15
 * @desc : 392. 判断子序列
 * https://leetcode-cn.com/problems/is-subsequence/
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
       int n = s.length(),m = t.length();
       int i=0,j =0;
       while (i<n&&j<m){
           if(s.charAt(i)==t.charAt(j)){
               i++;
           }
           j++;
       }
       return i==n;
    }
    public static void main(String[] args){

        System.out.println(new IsSubsequence().isSubsequence("abc", "ahbgdc"));//true
        System.out.println(new IsSubsequence().isSubsequence("axc", "ahbgdc"));//false
        System.out.println(new IsSubsequence().isSubsequence("acb", "ahbgdc"));//false 需要顺序
    }


}
