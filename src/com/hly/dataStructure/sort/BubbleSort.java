package com.hly.dataStructure.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/12
 */
//冒泡排序(交换排序)
public class BubbleSort {

    public static void bubbleSort(int arrays[]) {
        boolean flag = true;
        for (int i = 1; i < arrays.length; i++) {
            flag = false;
            for (int j = 0; j < arrays.length - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                    flag = true;
                }
            }
            //如果为 false 说明没有发生交换，数组有序，直接退出。
            if (flag == false)
                break;
        }
    }
    public static void main(String[] args) {
        int a[] = {5, 3, 1, 4, 2};
        bubbleSort(a);
        for (int i : a)
            System.out.print(i + " ");
    }
}
