package com.hly.leetCode.offer.offer1;

import java.util.Arrays;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/2/29
 * @QQ :1136513099
 * @desc : 面试题11. 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。 
 * 输入：[3,4,5,1,2]
 * 输出：1
 */
public class MinArray_11 {

    //解法1：排序
    public static int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int[] arr2 = {3, 1};
        int[] arr3 = {1};
        int[] arr4 = {2, 2, 2, 0, 1};
        int[] arr5 = {1, 2, 1};
        System.out.println(minArray(arr));
        System.out.println(minArray(arr2));
        System.out.println(minArray(arr5));

    }
}
