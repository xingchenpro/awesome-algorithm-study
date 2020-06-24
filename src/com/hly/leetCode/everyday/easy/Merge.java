package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/24
 * @QQ :1136513099
 * @desc : 88. 合并两个有序数组
 * https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;
        //任意一个数据遍历完成，跳出
        while ((p1 >= 0) && (p2 >= 0)) {
            //把大的放到后面
            nums1[p--] = (nums1[p1] < nums2[p2] ? nums2[p2--] : nums1[p1--]);
        }
        //arraycopy：原数组，原数组的起始位，目标数组，目标数组起始位，需要复制的长度
        //假设 nums2 的数都比 nums1 小，Nums1 的数都赋值完毕，跳出 while,把 nums2 剩余的复制到 nums1
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }

    public static void main(String[] args) {
        new Merge().merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        //3 3 4 5
        new Merge().merge(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3);
    }
}
