package com.stardust.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/9
 * @desc : 21. 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 */
public class Exchange {

    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            //left<right 防止溢出，如果都是奇数，会一直循环
            while (nums[left] % 2 != 0 && left < right) {
                left++;
            }
            while (nums[right] % 2 == 0 && left < right) {
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            //交换后不忘迭代
            left++;
            right--;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] res = new Exchange().exchange(new int[]{1, 2, 3, 4});
        int[] res2 = new Exchange().exchange(new int[]{1, 3, 5});
        for (int re : res2) {
            System.out.print(re + " ");
        }
    }
}
