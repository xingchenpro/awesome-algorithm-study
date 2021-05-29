package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/18
 * @desc : TODO 443. 压缩字符串
 * https://leetcode-cn.com/problems/string-compression/
 */
public class Compress {

    public int compress(char[] chars) {
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(new Compress().compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));//6
        System.out.println(new Compress().compress(new char[]{'a'}));//1
        System.out.println(new Compress().compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));//4

    }
}
