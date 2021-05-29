package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/10/3
 * @desc : 551. 学生出勤记录 I
 * https://leetcode-cn.com/problems/student-attendance-record-i/
 */
public class CheckRecord {
    public boolean checkRecord(String s) {
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
                if (a > 1) {
                    return false;
                }
            } else if ((i - 2) >= 0 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new CheckRecord().checkRecord("PPALLP"));
        System.out.println(new CheckRecord().checkRecord("PPALLL"));
        System.out.println(new CheckRecord().checkRecord("LALL"));
        System.out.println(new CheckRecord().checkRecord("LLL"));//false
    }
}
