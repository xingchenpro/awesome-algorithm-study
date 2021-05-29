package com.stardust.offer;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/4/26
 * @desc : 11. 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 */
public class MinArray {

    //二分
    //顺序存储
    //元素有序

    //O(log n)
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        if (high == 0) {
            return numbers[0];
        }
        while (low < high) {
            //避免溢出
            int pivot = low + (high - low) / 2;
            //pivot 是最小值右侧的元素
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
                //pivot 是最小值左侧的元素
            } else if (numbers[pivot] > numbers[high]) {
                //numbers[pivot] > numbers[high] 说明，pivot 不是最小值，可以往前一位
                low = pivot + 1;
            } else {
                //暴力缩小范围
                high -= 1;
            }
        }
        return numbers[low];
    }

    public static void main(String[] args) {
        System.out.println(new MinArray().minArray(new int[]{3, 4, 5, 1, 2}));


    }
}
