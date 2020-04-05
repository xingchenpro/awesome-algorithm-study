package com.hly.algorithm.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc : 快速排序
 * https://blog.csdn.net/adusts/article/details/80882649
 */
public class QuickSort {

    public static int partition(int[] arrays, int low, int high) {
        //i,j 是哨兵，t 是准基数(枢轴）
        int i = low, j = high, t = arrays[low];
        while (i != j) {
            //从右边找一个比基准数小的数
            while (arrays[j] >= t && i < j) {
                j--;
            }
            while (arrays[i] <= t && i < j) {
                i++;
            }
            //如果找到了就交换
            if (i < j) {
                swap(arrays, i, j);
            }
        }
        //两个哨兵相遇后，i=j,与基准数交换？
        arrays[low] = arrays[i];
        arrays[i] = t;
        //继续对前一部分和后一部分排序
        return i;
    }

    public static void quickSort(int[] arrays, int low, int high) {
        if (arrays == null || arrays.length <= 1 || low >= high)
            return;
        int mid = partition(arrays, low, high);
        quickSort(arrays, low, mid - 1);
        quickSort(arrays, mid + 1, high);
    }

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 99, 4, 5, 10, 8, 3};
        int[] arr2 = {5, 4, 3, 2, 1};
        quickSort(arr2, 0, arr2.length - 1);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
