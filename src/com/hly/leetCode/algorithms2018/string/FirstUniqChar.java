package com.hly.leetCode.algorithms2018.string;

import java.util.*;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/25
 * @QQ :1136513099
 * @desc : 387. 字符串中的第一个唯一字符
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        if (s.trim().equals(""))
            return -1;
        Queue<Character> queue = new LinkedList<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!queue.contains(s.charAt(i))) {
                if(!list.contains(s.charAt(i)))
                queue.offer(s.charAt(i));
            } else {
                queue.remove(s.charAt(i));
                list.add(s.charAt(i));
            }
        }
        if (queue.size() == 0)
            return -1;
        return s.indexOf(queue.peek());
    }

    public static void main(String[] args) {
        System.out.println(new FirstUniqChar().firstUniqChar("loveleetcode"));//2
        System.out.println(new FirstUniqChar().firstUniqChar("aadadaad"));//-1
    }

}
