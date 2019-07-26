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
 * @desc : todo 131. 分割回文串
 */
public class Partition {

     List<List<String>> result = new ArrayList<>();

    public  List<List<String>> partition(String s) {
        if (s.equals("") || s.length() == 0)
            return result;
        List<String> list = new ArrayList<>();
        backTracing(list, s, 0);
        return result;
    }

    public  void backTracing(List<String> list, String s, int i) {

        if (i == s.length())
            result.add(list);
        for (int j = i + 1; j <= s.length(); j++) {
            if (isPalindrome(s.substring(i, j))) {
                list.add(s.substring(i, j));
                backTracing(new ArrayList<String>(list), s, j);
                // 获取到的回文串集合添加到result中后，回溯将temp中的数据全部移除
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s) {
        if (s.equals("") || s.length() == 0)
            return false;
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }
        if (i >= j)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Partition().partition("aab"));
    }
}
