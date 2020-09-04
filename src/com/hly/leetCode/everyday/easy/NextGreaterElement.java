package com.hly.leetCode.everyday.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/9/2
 * @desc : TODO 496. 下一个更大元素 I
 * https://leetcode-cn.com/problems/next-greater-element-i/
 */
public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //栈底元素最大
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        for (int i=0;i<nums2.length;i++){
            while (!stack.empty()&&nums2[i]>stack.peek())
                map.put(stack.pop(),nums2[i]);
            stack.push(nums2[i]);
        }
        while (!stack.isEmpty())
            map.put(stack.pop(),-1);
        for(int i=0;i<nums1.length;i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        //[4,2,1],[1,3,4,2]？【1,->3】 kkkk数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素
        //[4,1,2],[1,3,4,2]
    }
}
