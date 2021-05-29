package com.hly.backup.leetCode;

import java.util.HashMap;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/14
 */
//13.罗马数字转整数
public class RomanToInt {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int value = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {//说明是最后一个数
                value += map.get(chars[i]);
                System.out.println("i:"+i);
            } else {
                Integer left = map.get(chars[i]);
                Integer right = map.get(chars[i + 1]);
                if (left >= right) {
                    value += left;
                } else {
                    value += right - left;
                    i++;//当考虑到后面的数比前面的数大，这里应该再加 1
                }
            }
        }
        return value;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("XXVII"));
    }
}
