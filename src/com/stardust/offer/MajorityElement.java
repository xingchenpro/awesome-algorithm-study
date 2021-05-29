package com.stardust.offer;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/26
 * @desc : 39. 数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {

        //从第一个开始遍历，相同的数就 +1，不同的数就 -1
        int count = 1;
        int cur = nums[0];

        for (int i = 1; i < nums.length; i++) {
            //这一步判断放在前面，==0,表示全部抵消
            if (count == 0) {
                cur = nums[i];
            }
            if (cur == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));//2
        System.out.println(new MajorityElement().majorityElement(new int[]{6, 5, 5}));//5
        System.out.println(new MajorityElement().majorityElement(new int[]{47, 47, 72, 47, 72, 47, 79, 47, 12, 92, 13, 47, 47, 83, 33, 15, 18, 47, 47, 47, 47, 64, 47, 65, 47, 47, 47, 47, 70, 47, 47, 55, 47, 15, 60, 47, 47, 47, 47, 47, 46, 30, 58, 59, 47, 47, 47, 47, 47, 90, 64, 37, 20, 47, 100, 84, 47, 47, 47, 47, 47, 89, 47, 36, 47, 60, 47, 18, 47, 34, 47, 47, 47, 47, 47, 22, 47, 54, 30, 11, 47, 47, 86, 47, 55, 40, 49, 34, 19, 67, 16, 47, 36, 47, 41, 19, 80, 47, 47, 27}));//47
    }


}
