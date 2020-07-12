package com.hly.leetCode.everyday.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/12
 * @desc : 205. 同构字符串
 * https://leetcode-cn.com/problems/isomorphic-strings/
 */
public class IsIsomorphic {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            //不存在 key
            if (!map.containsKey(s.charAt(i))) {
                //不存在 key，但存在 value
                //egg ,bbb
                if (map.containsValue(t.charAt(i)))
                    return false;
                //放入 key:value 对应 s 和 t 的 i
                map.put(s.charAt(i), t.charAt(i));
            } else {
                //存在 key，但 key 不对应 value
                //比如 foo , bar ,存在 o，但 o 应该对应 a
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsIsomorphic().isIsomorphic("egg", "add"));//true
    }
}
