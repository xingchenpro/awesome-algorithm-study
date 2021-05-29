package com.hly.test.baiou;

import java.util.*;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/26
 * @QQ :1136513099
 * @desc :
 */
public class File {

    public static char[] calFiles(String[] files) {
        Map<Character, Integer> map = new HashMap<>();
        for (String file : files) {
            for (int i = 0; i < file.length(); i++) {
                if (!map.containsKey(file.charAt(i))) {
                    map.put(file.charAt(i), 1);
                } else {
                    map.put(file.charAt(i), map.get(file.charAt(i)) + 1);
                }
            }
        }
        //维护最小堆
        Queue<Character> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Character tmp = (Character) iterator.next();
            if (queue.size() < 5) {

                queue.offer(tmp);
            }
            if (queue.size() == 5 && queue.peek() < map.get(tmp)) {
                queue.poll();
                queue.offer(tmp);
            }
        }
        char[] res = new char[queue.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = queue.poll();
        }
        return res;

    }

    public static String[] readLines(String file) {
        return file.split(" ");
    }


}
