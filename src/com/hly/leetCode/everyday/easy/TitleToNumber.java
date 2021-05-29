package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/6
 * @desc : *171. Excel表列序号
 * https://leetcode-cn.com/problems/excel-sheet-column-number/
 */
public class TitleToNumber {

    public int titleToNumber(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'A' + 1;
            res = res * 26 + num;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new TitleToNumber().titleToNumber("AB"));
    }
}
