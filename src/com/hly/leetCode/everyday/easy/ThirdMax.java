package com.hly.leetCode.everyday.easy;


import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/17
 * @desc : 414. 第三大的数
 * https://leetcode-cn.com/problems/third-maximum-number/
 */
public class ThirdMax {

    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        if (set.size() < 3) {
            Arrays.sort(nums);
            return nums[nums.length - 1];
        }
        //默认小顶堆
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : set) {
            if (queue.size() < 3) {
                queue.offer(i);
            } else {
                if (queue.size() == 3 && queue.peek() < i) {
                    queue.poll();
                    queue.offer(i);
                }
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        System.out.println(new ThirdMax().thirdMax(new int[]{3, 2, 1}));//1
        System.out.println(new ThirdMax().thirdMax(new int[]{2, 1}));//2
        System.out.println(new ThirdMax().thirdMax(new int[]{2, 2, 3, 1}));//2
        System.out.println(new ThirdMax().thirdMax(new int[]{1, 1, 2}));//2


    }
}
