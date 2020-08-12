package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/12
 * @desc : 371. 两整数之和
 * https://leetcode-cn.com/problems/sum-of-two-integers/
 */
public class GetSum {

    //异或 ^，相同为 0，不同为1
    // a = 5(0101),b = 4(0100),得到无进位加法结果
    public int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        int low, carr;
        while (true) {
            low = a ^ b;//计算低位
            carr = a & b;//计算进位
            //https://leetcode-cn.com/problems/sum-of-two-integers/solution/wei-yun-suan-xiang-jie-yi-ji-zai-python-zhong-xu-y/
            if (carr == 0)
                break;
            a = low;
            b = carr << 1;
        }
        return low;
    }

    public static void main(String[] args) {


    }
}
