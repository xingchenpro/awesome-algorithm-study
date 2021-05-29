package com.hly.leetCode.offer.offer3;

import java.util.Arrays;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/21
 * @QQ :1136513099
 * @desc :面试题61. 扑克牌中的顺子
 */
public class IsStraight {

    public boolean isStraight(int[] nums) {
        //排序
        Arrays.sort(nums);
        int joker = 0;//统计大小王的数量
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0)
                joker++;
            else if (nums[i] == nums[i + 1])
                return false;
        }
        //最大数-最小数<5
        return nums[4] - nums[joker] < 5;
    }
}
