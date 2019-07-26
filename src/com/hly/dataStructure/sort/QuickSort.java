package com.hly.dataStructure.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/12
 */

//快速排序(冒泡排序的改进算法，采用分治策略)
//https://blog.csdn.net/shujuelin/article/details/82423852
public class QuickSort {

    //C.R.Hoare 设计
    public static void quickSort1(int[] arr, int low, int high) {
        if (low > high)
            return;
        int i, j, t;
        i = low;
        j = high;
        // t 基准数 i,j 是哨兵
        t = arr[low];
        while (i < j) {
            //从右边找一个比基准数小的数
            while (t <= arr[j] && i < j) {
                j--;
            }
            //从左边找一个比基准数大的数
            while (t >= arr[i] && i < j) {
                i++;
            }
            //如果找到了，就交换
            //任何一个数与给定的值异或两次，值不变，相等，否则出错，这里应该多个判断
            if (i < j) {
                arr[i] ^= arr[j];
                arr[j] ^= arr[i];
                arr[i] ^= arr[j];
            }
        }
        //两个哨兵相遇后，与基准数交换
        arr[low] = arr[i];
        arr[i] = t;
        quickSort1(arr, low, i - 1);
        quickSort1(arr, i + 1, high);
    }


    //N.Lomuto提出
    public static void quickSort2(int[] arr, int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            quickSort2(arr, p, q - 1);
            quickSort2(arr, q + 1, r);
        }
    }
    public static int partition(int[] arr, int p, int r) {

        int i = p - 1;//第一遍 i从-1开始
        // t 基准数 i,j 是哨兵
        int x = arr[r];//把最后一个值赋给x
        //j从第一个值开始
        for (int j = p; j < r; j++) {
            //如果j小于或等于基准值
            if (arr[j] <= x) {
                //i加一，如果j大于基准值，这里不做改变
                i ++;
                //交换i和j的值
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        //交换基准值和i+1,一遍过后，基准值左边的都小于基准值，右边的都大于基准值
        int t = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = t;
        //返回中间分割数所在的下标
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 62, 3, 2, 1, 8, 9, 19};
        quickSort2(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
