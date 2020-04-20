package com.hly.leetCode.offer.offer1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/2/26
 * @QQ :1136513099
 * @desc : 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 输入：[2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * 考察：时间/空间(O1)
 */
public class FindRepeatNumber_03 {

    //解法1：时间O(n),空间O(n)
    public static int findRepeatNumber1(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
            if (arr[nums[i]] > 1) {
                return nums[i];
            }
        }
        return -1;
    }

    //解法2：时间O(n),空间O(1)
    public static int findRepeatNumber2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //如果当前数组的值不等于下标
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                } else {
                    //把当前数组的值放在对应的下标下
                    //nums[i] = nums[nums[i]]会发生死循环
                    int t = nums[i];
                    int n = nums[i];
                    nums[i] = nums[t];
                    nums[t] = n;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber1(nums));
        System.out.println(findRepeatNumber2(nums));
    }
}
