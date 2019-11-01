package com.hly.algorithm.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc : 选择排序
 */
public class SelectionSort {

    public static void selectSort(int[] arrays) {
        int min;
        for (int i = 0; i < arrays.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] < arrays[min]) {
                    min = j;
                }
            }
            int t = arrays[i];
            arrays[i] = arrays[min];
            arrays[min] = t;
        }
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{5, 2, 3, 4, 1};
        selectSort(arrays);
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}
