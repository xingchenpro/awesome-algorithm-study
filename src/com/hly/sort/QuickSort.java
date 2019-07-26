package com.hly.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc : 快速排序
 */
public class QuickSort {

    public static void quickSort(int[] arrays, int low, int high) {
        if (low > high)
            return;
        //i,j 是哨兵，t 是准基数
        int i = low, j = high, t = arrays[low];
        while (i < j) {
            //从右边找一个比基准数小的数
            while (arrays[j] >= t && i < j) {
                j--;
            }
            while (arrays[i] <= t && i < j) {
                i++;
            }
            //如果找到了就交换
            if (i < j) {
                arrays[i] = arrays[i] + arrays[j];
                arrays[j] = arrays[i] - arrays[j];
                arrays[i] = arrays[i] - arrays[j];
            }
            //两个哨兵相遇后，与基准数交换
            arrays[low] = arrays[i];
            arrays[i] = t;
            //继续对前一部分和后一部分排序
            quickSort(arrays, low, i - 1);
            quickSort(arrays, i + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 62, 3, 2, 1, 8, 9, 19};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
