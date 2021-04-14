package com.stardust.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/4/13
 * @desc : 03. 数组中重复的数字
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 */
public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int i = 0; i < nums.length; i++) {
            // add 底层为 HashMap 的 put 方法
            //如果已经存在一个相同的 key， 则返回的是前一个key对应的value，同时该key的新value覆盖旧value；
            //如果是新的一个key，则返回的是null
            //return map.put(e, PRESENT)==null;
            //不是 null ,表示 为 false ,即存在元素
           if(!set.add(nums[i])){
               repeat = nums[i];
           }
        }
        return  repeat;

    }

    public static void main(String[] args) {
        System.out.println(new FindRepeatNumber().findRepeatNumber(new  int[]{2, 3, 1, 0, 2, 5, 3}));
    }

}
