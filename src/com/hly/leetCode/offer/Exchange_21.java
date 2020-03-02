package com.hly.leetCode.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/2
 * @QQ :1136513099
 * @desc : 面试题21. 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 */
public class Exchange_21 {

    public static int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1;
        //前面找出偶数，后面找出奇数
        while (i < j) {
            //注意边界值
            while (nums[i] % 2 != 0 && i < nums.length - 1) {
                i++;
            }
            while (nums[j] % 2 == 0 && j > 0) {
                j--;
            }
            //这里需要判断，防止第一次循环交换
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int nums2[] = {1, 3, 5};
        int nums3[] = {1, 11, 14};
        exchange(nums3);
        for (int num : nums3) {
            System.out.print(num + " ");
        }
    }
}
