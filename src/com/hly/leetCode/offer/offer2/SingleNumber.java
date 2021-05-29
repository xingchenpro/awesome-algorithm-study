package com.hly.leetCode.offer.offer2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/13
 * @QQ :1136513099
 * @desc : TODO 面试题56 - I. 数组中数字出现的次数
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 * (一个数字就可以用异或)
 * 思路：Hash || 排序 ||  set
 */
public class SingleNumber {

    //解法1：hash
    public int[] singleNumbers(int[] nums) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int num : nums) {
            if (!res.containsKey(num)) {
                res.put(num, 1);
            } else {
                res.put(num, res.get(num) + 1);
            }
        }
        int[] result = new int[2];
        int i = 0;
        Iterator<Integer> iterator = res.keySet().iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (res.get(t) == 1) {
                result[i++] = t;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 10, 4, 2, 1, 4, 3, 3};


    }
}
