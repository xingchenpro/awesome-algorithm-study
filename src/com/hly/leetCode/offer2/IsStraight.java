package com.hly.leetCode.offer2;

import java.util.Arrays;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/10
 * @QQ :1136513099
 * @desc : 面试题61. 扑克牌中的顺子
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 * 排序之后扑克牌就有序了，我们就可以直接判断相邻两张牌之间需要多少个大王或小王来填补。
 * 如果需要填补大小王的数量，大于已有大小王的数量，则返回 falsefalse .相反，如果需要填补大小王的数量，小于或等于已有大小王的数量，则返回 truetrue
 */
public class IsStraight {

    public boolean isStraight(int[] nums) {

        Arrays.sort(nums);
        int zero = 0;
        //只有4个数
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0) {
                zero++;
                continue;
            }
            //有两个相等的数
            if (nums[i] == nums[i + 1]) {
                return false;
            }
            zero -= nums[i + 1] - nums[i] - 1;
        }
        return zero >= 0;
    }
}
