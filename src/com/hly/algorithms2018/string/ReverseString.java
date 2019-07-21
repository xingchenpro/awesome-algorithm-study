package com.hly.algorithms2018.string;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/21
 * @QQ :1136513099
 * @desc : AC 344.反转字符串
 */
public class ReverseString {

    public static void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char c = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = c;
        }
    }

    public static void main(String[] args){
        char []s={'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
}
