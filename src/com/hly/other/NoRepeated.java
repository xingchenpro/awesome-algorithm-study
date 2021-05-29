package com.hly.other;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/20
 * @QQ :1136513099
 * @desc :
 */
public class NoRepeated {


    //解法1：hashMap
    public static int fingNoRepeated1(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            if (map.get(key) == 1)
                return key;
        }
        return -1;
    }


    //解法2：
    public static int fingNoRepeated(int[] arr) {
        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5, 5};
        System.out.println(fingNoRepeated1(arr));


    }
}

