package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/27
 * @desc : 492. 构造矩形
 * https://leetcode-cn.com/problems/construct-the-rectangle/
 */

public class ConstructRectangle {

    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            w--;
        }
        return new int[]{area / w, w};
    }
    public static void main(String[] args) {
        int[] res = new ConstructRectangle().constructRectangle(4);//2,2
        int[] res1 = new ConstructRectangle().constructRectangle(1);//1,1
        int[] res3 = new ConstructRectangle().constructRectangle(6);//1,1
        for (int re : res3) {
            System.out.print(re + " ");
        }

    }
}
