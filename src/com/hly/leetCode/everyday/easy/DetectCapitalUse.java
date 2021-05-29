package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/9/17
 * @desc : 520. 检测大写字母
 * https://leetcode-cn.com/problems/detect-capital/
 */
public class DetectCapitalUse {

    //“+”表示匹配前bai面的子表达式一次或多次(大于等于1次）
    public boolean detectCapitalUse(String word) {
        return word.matches("[a-z]+|[A-Z][a-z]*|[A-Z]+");
    }

}
