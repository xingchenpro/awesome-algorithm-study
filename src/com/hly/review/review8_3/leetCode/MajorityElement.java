package com.hly.review.review8_3.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/3
 * @QQ :1136513099
 * @desc : 求众数
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 1;
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0)
                result = nums[i];
                count += (result == nums[i]) ? 1 : -1;
        }
        return result;
    }
}
