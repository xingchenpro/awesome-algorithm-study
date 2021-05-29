package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/9/13
 * @desc : 504. 七进制数
 * https://leetcode-cn.com/problems/base-7/
 */
public class ConvertToBase7 {

    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }

    public static void main(String[] args) {
        //100/7=14 余 2 //2
        //14/7=2 余 0 //20
        //结果为 202 //20 2
        System.out.println(new ConvertToBase7().convertToBase7(100));//202
        System.out.println(new ConvertToBase7().convertToBase7(-7));//-10


    }
}
