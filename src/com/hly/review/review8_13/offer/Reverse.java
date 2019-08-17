package com.hly.review.review8_13.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/2
 * @QQ :1136513099
 * @desc :58、反转单词顺序
 */
public class Reverse {

    public String doReverse(String s) {
        if (s == null || s.length() == 0)
            return null;
        char[] chars = s.toCharArray();
        int i = 0, j = 0;
        while (i<=chars.length){
            if(i==chars.length||chars[i]==' '){
                reverse(chars,j,i-1);
                j = i+1;
            }
            i++;
        }
        reverse(chars,0,chars.length-1);
        return new String(chars);
    }

    //翻转字符串
    private void reverse(char[] chars, int i, int j) {
        if (chars == null || chars.length == 0)
            return;
        while (i < j) {
            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Reverse().doReverse("asdcs"));
        System.out.println(new Reverse().doReverse("I am a student."));//"student. a am I"

    }

}
