package com.hly.backup.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/18
 */
//todo 28.实现 strStr() 函数
public class StrStr {

    public static int strStr(String haystack, String needle) {
        if (needle == "" || needle == null)
            return 0;
        int j = 0, k = 0,index =0;
        boolean start = true;
        for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(j)) {
                    if(start==true){
                        index = i;
                        start = false;
                    }
                    k++;
                    if (k == needle.length())
                        return index;
                    j++;
                } else {
                    start = true;
                    k = 0;
                    j = 0;
                }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
    }
}
