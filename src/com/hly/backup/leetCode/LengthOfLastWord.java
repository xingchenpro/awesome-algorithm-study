package com.hly.backup.leetCode;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/20
 */
//58.最后一个单词长度
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if(s==null||s.length()==0) return 0;
        String [] words = s.trim().split(" ");
        return words[words.length-1].length();
    }
    public static void main(String[] args){

    }


}
