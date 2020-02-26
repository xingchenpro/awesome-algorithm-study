package com.hly.offer.chapter2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/11/8
 * @QQ :1136513099
 * @desc :11、旋转数组最小数字
 */

/**
 * 描述：把一个数组最开始若干元素搬到末尾，称为数组的旋转，输入一个递增排序数组的一个旋转，输出旋转数组的最小元素
 * 输入：{3,4,5,1,2} 为 {1,2,3,4,5} 的一个旋转
 * 输出：1(时间复杂度logn)
 */
public class Min {

    public static int min(int[] arr) {
        if (arr == null) {
            return -1;
        }
        int index1 = 0;
        int index2 = arr.length - 1;
        int indexMid = index1;
        while (arr[index1] >= arr[index2]) {
            if (index2 - index1 == 1) {
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2) / 2;
            if (arr[indexMid] >= arr[index1]) {
                index1 = indexMid;
            } else if (arr[indexMid] <= arr[index2]) {
                index2 = indexMid;
            }
        }
        return arr[indexMid];
    }

    public static void main(String[] args) {

        int arr[] = {3, 4, 5, 1, 2};
        int arr2[] = {3, 4, 1, 1, 2};
        int arr3[] = {3};
        int arr4[] =null;
        System.out.println(min(arr));
        System.out.println(min(arr2));
        System.out.println(min(arr3));
        System.out.println(min(arr4));
    }
}
