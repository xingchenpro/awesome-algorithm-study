package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/12
 * @desc : 374. 猜数字大小
 * https://leetcode-cn.com/problems/guess-number-higher-or-lower/
 */
public class GuessNumber {

    public int guessNumber(int n) {
        int low = 1, high = n;
        while (low <= high) {
           /* int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }*/
        }
        return -1;
    }
}
