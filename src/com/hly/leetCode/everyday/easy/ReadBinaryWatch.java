package com.hly.leetCode.everyday.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/15
 * @desc : 401. 二进制手表
 * https://leetcode-cn.com/problems/binary-watch/
 */
public class ReadBinaryWatch {

    //bitCount(i)  int,long 类型的数在二进制下 1 的个数
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                //二进制中 1 的数量的和是否为 num，比如 2、4 在二进制中 1 的数量为 1
                if (Integer.bitCount(i) + Integer.bitCount(j) == num) {
                    times.add(String.format("%d:%02d", i, j));
                }
            }
        }
        return times;
    }

    public static void main(String[] args) {
        System.out.println(new ReadBinaryWatch().readBinaryWatch(1));
        System.out.println(Integer.bitCount(2));
        System.out.println(Integer.bitCount(4));
    }
}
