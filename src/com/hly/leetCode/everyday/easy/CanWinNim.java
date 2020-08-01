package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/1
 * @desc : 292. Nim 游戏
 * https://leetcode-cn.com/problems/nim-game/
 */
public class CanWinNim {

    //先拿，不是4的倍数
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        System.out.println(new CanWinNim().canWinNim(1));//true

    }
}
