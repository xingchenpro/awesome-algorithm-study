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
//todo 分割回文串
//给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
//返回 s 所有可能的分割方案。
public class Partition {

    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();


    }

    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while (i<j&&s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }
        if(i>=j)
            return true;
        return false;
    }

    public static void main(String[] args){




    }

}
