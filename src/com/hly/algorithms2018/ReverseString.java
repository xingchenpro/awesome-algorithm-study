package com.hly.algorithms2018;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/7
 */
//AC 反转字符串
//编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
//不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
public class ReverseString {

    public static void reverseString(char[] s) {
        int i= 0;
        int j= s.length-1;
        char t =' ';
        while (i<=j){
            t= s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
        }
        for(char c :s)
            System.out.print(c+" ");
    }
    public static void main(String[] args){
        char []s ={'H','a','n','n','a','h'};
        reverseString(s);
    }
}
