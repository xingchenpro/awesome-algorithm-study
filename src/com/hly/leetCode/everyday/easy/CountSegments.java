package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/17
 * @desc : 434. 字符串中的单词数
 * https://leetcode-cn.com/problems/number-of-segments-in-a-string/
 */
public class CountSegments {

    public int countSegments(String s) {
        if (s.trim().equals(""))
            return 0;
        // \\s表示 空格,回车,换行等空白符，+号表示一个或多个
        return s.trim().split("\\s+").length;

    }

    public static void main(String[] args) {
        System.out.println(new CountSegments().countSegments("Hello, my name is John"));//5
        System.out.println(new CountSegments().countSegments(""));//0
        System.out.println(new CountSegments().countSegments(", , , ,        a, eaefa"));//6


    }
}
