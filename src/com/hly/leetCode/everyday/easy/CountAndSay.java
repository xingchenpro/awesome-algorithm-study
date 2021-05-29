package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/20
 * @QQ :1136513099
 * @desc : TODO 38. 外观数列
 * https://leetcode-cn.com/problems/count-and-say/
 */
public class CountAndSay {

    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        return "1";
    }

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(20));
        System.out.println(new CountAndSay().countAndSay(1));
    }
}
