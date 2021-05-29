package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/15
 * @desc : 405. 数字转换为十六进制数
 * https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal/
 */
public class ToHex {

    //http://c.biancheng.net/view/4700.html
    public String toHex(int num) {
        return String.format("%x", num);
    }
    public static void main(String[] args){
        System.out.println(new ToHex().toHex(10));
    }

}
