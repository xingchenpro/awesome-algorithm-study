package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/20
 * @QQ :1136513099
 * @desc : TODO 面试题03 数组中重复的数字
 */
public class FindRepeatNumber {

    //解法1：hash
    //解法2：排序
    //解法3：雀巢
    public static int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //这里通过循环判断直到找到
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                //这里交换的时候，数值不能嵌套
                int t = nums[i];
                nums[i] = nums[t];
                nums[t] = t;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        int[] arr2 = {0, 1, 2, 3, 2, 5, 3};
        System.out.println(findRepeatNumber(arr));
    }
}
