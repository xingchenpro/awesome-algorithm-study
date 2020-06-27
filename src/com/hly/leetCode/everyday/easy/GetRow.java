package com.hly.leetCode.everyday.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/6/27
 * @desc : 119. 杨辉三角 II
 * https://leetcode-cn.com/problems/pascals-triangle-ii/
 */
public class GetRow {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        //题目返回第 k 行，如果是第 3 行，结果为 [1,3,3,1]，是数组下标的 3，，所以数组行数需要 +1
        int[][] nums = new int[rowIndex + 1][rowIndex + 1];
        for (int i = 0; i < rowIndex + 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    nums[i][j] = 1;
                } else {
                    nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
                }
            }
        }
        for (int k = 0; k < rowIndex + 1; k++) {
            result.add(nums[rowIndex][k]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new GetRow().getRow(3));//[1,3,3,1]
    }
}
