package com.hly.algorithms2018;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/4
 */
//todo 分割回文串***
//给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
//返回 s 所有可能的分割方案。
public class Partition {

    public static List<List<String>> partition(String s) {
        if(s.length()==0)
            return null;
        List<List<String>> res = new ArrayList<>();
        backTrack(s,0,new ArrayList<>(),res);
        return res;
    }

    public static void backTrack(String s,int index,List<String> cur,List<List<String>> res){
        if(index==s.length()){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                cur.add(new String(s.toCharArray(),index,i-index+1));
                backTrack(s,i+1,cur,res);
                cur.remove(cur.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s,int i,int j){
        while (i<j&&s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }
        if(i>=j)
            return true;
        return false;
    }

    public static void main(String[] args){

        System.err.println(partition("aab"));
    }

}

//回溯算法