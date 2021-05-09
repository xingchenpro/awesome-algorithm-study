package com.stardust.offer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/9
 * @desc : 20. 表示数值的字符串
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 */
public class IsNumber {

    public boolean isNumber(String s) {
        if (s == null || s.trim().equals(""))
            return false;
        String regex = "([+-]?(([0-9]*([.]?[0-9]+))|([0-9]+([.]?[0-9]?))))(([eE][+-]?)?[0-9]+)?";
        Matcher matcher = Pattern.compile(regex).matcher(s.trim());
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(new IsNumber().isNumber("12e"));//false
    }
}
