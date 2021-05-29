package com.hly.algorithm.sort;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc : 插入排序
 */
public class InsertSort {

    public static void insertSort(int arrays[]) {
        for (int i = 1; i < arrays.length; i++) {
            int key = arrays[i];
            int j = i - 1;
            while (j >= 0 && arrays[j] > key) {
                arrays[j + 1] = arrays[j];
                j--;
            }
            arrays[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{4, 2, 1, 3, 5};
        insertSort(arrays);
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}
