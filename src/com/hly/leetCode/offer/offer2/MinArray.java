package com.hly.leetCode.offer.offer2;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/5
 * @QQ :1136513099
 * @desc : 面试题11. 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 */
public class MinArray {

    //解法1：排序
    public int minArray(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
        return numbers[0];
    }

    public void quickSort(int[] numbers, int low, int high) {
        //低位大于高位，跳出
        if (low > high)
            return;
        int t = numbers[low], i = low, j = high;
        while (i != j) {
            while (numbers[j] >= t && i < j) {
                j--;
            }
            while (numbers[i] <= t && i < j) {
                i++;
            }
            if (i < j) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        numbers[low] = numbers[i];
        numbers[i] = t;
        quickSort(numbers, low, i - 1);
        quickSort(numbers, i + 1, high);
    }


    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        MinArray minArray = new MinArray();
        minArray.minArray(nums);
        System.out.println(nums[0]);
    }

}
