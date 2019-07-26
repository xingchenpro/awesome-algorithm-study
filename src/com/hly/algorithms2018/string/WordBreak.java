package com.hly.algorithms2018.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/25
 * @QQ :1136513099
 * @desc : 139. 单词拆分
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
       int n = s.length();
       boolean dp [] = new boolean[n+1];
       dp[0] =true;
       for(int i=1;i<=n;i++){
           for(int j=0;j<i;j++){
               if(dp[j]&&wordDict.contains(s.substring(j,i))){
                   dp[i] =true;
                   break;
               }
           }
       }
       return dp[n];
    }

    public static void main(String[] args){
        System.out.println(new WordBreak().wordBreak("leetcode",new ArrayList<String>(){{add("leet" );add("code");}}));
    }


}
