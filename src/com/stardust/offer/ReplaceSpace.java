package com.stardust.offer;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/4/17
 * @desc : 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class ReplaceSpace {

    public String replaceSpace(String s) {
        return s.replace(" ","%20");

    }

    public static void main(String[] args){
        System.out.println(new ReplaceSpace().replaceSpace("We are happy."));
    }
}
