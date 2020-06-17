package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/17
 * @QQ :1136513099
 * @desc : 27. 移除元素
 * https://leetcode-cn.com/problems/remove-element/
 */
public class RemoveElement {

    //移除等于 x 的元素，使用不等于的去覆盖
    public int removeElement(int[] nums, int val) {
        //不等于 val 的元素的下标，从 0 开始覆盖
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                //出现一个不等于 val 的就 ++，最终 index 的值为移除 val 后新数组的长度
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{3, 2, 2, 3}, 3));//2
        System.out.println(new RemoveElement().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));//5
    }
}
