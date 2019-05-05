package com.hly.algorithms2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/5
 */
//todo 单词拆分(动态规划)
//给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
//能被拆分，拆分后没有多余的字母
public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {

        int n = s.length();
        boolean[]dp = new boolean[n+1];
        dp[0] = true;
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    System.err.println(i);
                    break;
                }
            }
        }
        return dp[n];
    }



    public static void main(String[] args){

        List<String> list1 = new ArrayList<>();

        System.out.println(wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        //System.err.println(wordBreak("leetcode", Arrays.asList("leet", "code")));
        //System.err.println(wordBreak("catsandog",Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }
}
//动态规划
//