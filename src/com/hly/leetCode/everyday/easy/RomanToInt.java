package com.hly.leetCode.everyday.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/16
 * @QQ :1136513099
 * @desc : 13. 罗马数字转整数
 * https://leetcode-cn.com/problems/roman-to-integer/
 */
public class RomanToInt {

    public int romanToInt(String s) {
        if (s.length() == 0)
            return 0;
        //将字符串转化为字符串数组
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (map.get(arr[i]) >= map.get(arr[i + 1])) {
                //前面的数>后面的数，加上对应的值
                res += map.get(arr[i]);
            } else {
                //前面的数<后面的数，减去对应的值
                res -= map.get(arr[i]);
            }
        }
        //加上最后一个数
        res += map.get(arr[arr.length - 1]);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInt().romanToInt("III"));//3
        System.out.println(new RomanToInt().romanToInt("IV"));//4
        System.out.println(new RomanToInt().romanToInt("IX"));//9
        System.out.println(new RomanToInt().romanToInt("LVIII"));//58 L = 50, V= 5, III = 3
    }
}
