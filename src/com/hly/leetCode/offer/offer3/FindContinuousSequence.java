package com.hly.leetCode.offer.offer3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/21
 * @QQ :1136513099
 * @desc : TODO 面试题57 - II. 和为s的连续正数序列
 */
public class FindContinuousSequence {

    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        for (int l = 1, r = 1, sum = 0; r < target; r++) {
            sum += r;
            //这里是 while
            while (sum > target) {
                sum -= l++;
            }
            if (sum == target) {
                int[] t = new int[r - l + 1];
                for (int i = 0; i < t.length; i++) {
                    t[i] = l + i;
                }
                list.add(t);
            }
        }
        int[][] res = new int[list.size()][];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
