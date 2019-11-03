package com.hly.offer.chapter1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/11/4
 * @QQ :1136513099
 * @desc : 5、替换空格
 */

/**
 * 题目：实现一个函数，把字符中的每一个空格都替换成%20
 * 输入：We are happy
 * 输出：We%20are%20happy
 */
public class ReplaceBlank {

    public  static String replaceBlank(String s){
        if(s==null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }else{
                sb.append("%20");
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(replaceBlank("We Are Happy"));
        System.out.println(replaceBlank("We Are"));
        System.out.println(replaceBlank(null));
        System.out.println(replaceBlank(""));
    }
}
