package com.hly.leetCode.offer.offer3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/22
 * @QQ :1136513099
 * @desc : 面试题56 - II 数组中数字出现的次数 II
 */
public class SingleNumber2 {

    //解法1：hash
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (map.get(i) == 1)
                return i;
        }
        return -1;
    }
}
