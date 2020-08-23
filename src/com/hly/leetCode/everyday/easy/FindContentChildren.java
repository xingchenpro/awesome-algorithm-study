package com.hly.leetCode.everyday.easy;

import java.util.Arrays;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/23
 * @desc : 455. 分发饼干
 * https://leetcode-cn.com/problems/assign-cookies/
 */
public class FindContentChildren {

    //贪心
    //饼干大小尽量小又能满足孩子，让较大的饼干满足要求较大的孩子，让更多的孩子得到满足
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0, res = 0;
        while (i < s.length && j < g.length) {
            //饼干大小满足孩子胃口
            if (s[i] >= g[j]) {
                res++;
                i++;
                j++;
            } else {
                //下一个饼干大小能否满足孩子
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new FindContentChildren().findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));


    }
}
