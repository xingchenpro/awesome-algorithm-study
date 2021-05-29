package com.stardust.offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/25
 * @desc : TODO *38. 字符串的排列
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 */
public class Permutation {


    public String[] permutation(String s) {
        Set<String> res = new HashSet<>();
        boolean[] visited = new boolean[s.length()];

        dfs(s.toCharArray(), "", res, visited);

        String[] result = new String[res.size()];

        int i = 0;
        for (String re : res) {
            result[i] = re;
            i++;
        }
        return result;
    }

    //回溯
    private void dfs(char[] chars, String curPath, Set<String> res, boolean[] visited) {

        if (curPath.length() == chars.length) {
            res.add(curPath);
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            dfs(chars, curPath + chars[i], res, visited);//执行到这一步才改变 curPath,//chars[i] 为 true 才会一层一层加上
            visited[i] = false;

        }
    }


    public static void main(String[] args) {
       String []  strings= new Permutation().permutation("abc");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
