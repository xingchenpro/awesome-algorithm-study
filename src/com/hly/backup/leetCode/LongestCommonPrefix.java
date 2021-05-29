package com.hly.backup.leetCode;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/14
 */
//14.最长公共【前缀】
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){//从第二个字符串开始遍历所有的字符串
            while (strs[i].indexOf(prefix)!=0){//返回子字符串在父字符串中首次出现的位置
                prefix = prefix.substring(0,prefix.length()-1);//如果没有，往前缩小前缀的长度，提取start 到 end -1 位置的字符串
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args){

        String [] strs ={"leess","leetcode","leet","leeds"};
        System.out.println(longestCommonPrefix(strs));
    }
}
