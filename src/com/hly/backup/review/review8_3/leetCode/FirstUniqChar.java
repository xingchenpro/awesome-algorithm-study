package com.hly.backup.review.review8_3.leetCode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/3
 * @QQ :1136513099
 * @desc :
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0)
            return -1;
        Queue<Character> queue = new LinkedList<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!queue.contains(s.charAt(i))) {
                if (!set.contains(s.charAt(i))) {
                    queue.offer(s.charAt(i));
                }
            } else {
                queue.remove(s.charAt(i));
                set.add(s.charAt(i));
            }
        }
        if (queue.size() == 0)
            return -1;
        return s.indexOf(queue.peek());
    }
}
