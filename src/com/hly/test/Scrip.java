package com.hly.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/14
 * @desc : 题目2
 */
public class Scrip {

    public static int[] secret(int month, int day, String info) {
        if (info == null || info.length() == 0)
            return new int[]{};
        int[] res = new int[info.length()];
        if (month <= 0 || month > 12 || day <= 0 || day > 31)
            return res;
        String[] strings = getMonthStrings(3);
        exchangeToDayStrings(strings, 8);

        Map<Character, Integer> map = getResultMap(strings);
        for (int i = 0; i < info.length(); i++) {
            res[i] = map.get(info.charAt(i));
        }
        return res;
    }

    /**
     * 把字符对应的序号存放到hash里面
     */
    public static Map<Character, Integer> getResultMap(String[] strings) {

        Map<Character, Integer> map = new HashMap<>(32);
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                map.put(strings[i].charAt(j), (i + 1) * 10 + j + 1);
            }
        }
        return map;
    }

    /**
     * 根据月份得到字符串数组
     */
    public static String[] getMonthStrings(int month) {
        int index = (month - 1) % 3;
        if (index == 0) {
            return new String[]{"ABCDEFGHI", "JKLMNOPQR", "STUVWXYZ*"};
        } else if (index == 1) {
            return new String[]{"JKLMNOPQR", "STUVWXYZ*", "ABCDEFGHI"};
        } else {
            return new String[]{"STUVWXYZ*", "ABCDEFGHI", "JKLMNOPQR"};
        }
    }

    /**
     * 根据日期转换字符串数组
     */
    public static void exchangeToDayStrings(String[] monthStrings, int day) {
        //移动多少次，移动9次为原来的结果，所以取余即可
        int time = (day - 1) % 9;
        for (int i = 0; i < monthStrings.length; i++) {
            String s = monthStrings[i];
            monthStrings[i] = s.substring(time, s.length()) + s.substring(0, time);
        }
    }

    public static void main(String[] args) {
        int[] res = secret(3, 8, "HAPPY");
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
