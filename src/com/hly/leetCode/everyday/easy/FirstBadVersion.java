package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/29
 * @desc : 278. 第一个错误的版本
 * https://leetcode-cn.com/problems/first-bad-version/
 */
public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            /*if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid+1;
            }*/
        }
        return left;
    }

}
