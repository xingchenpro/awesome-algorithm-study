package com.hly.algorithm.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc : 希尔排序
 */
public class ShellSort {

    public static void shellSort(int[] arrays, int d[]) {

        for (int k = 0; k < d.length; k++) {
            int dk = d[k];
            for (int i = dk; i < arrays.length; i++) {
                int key = arrays[i];
                int j = i - dk;
                while (j >= 0 && arrays[j] > key) {
                    arrays[j + dk] = arrays[j];
                    j -= dk;
                }
                arrays[j + dk] = key;
            }
        }
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{5, 4, 3, 2, 1};
        shellSort(arrays, new int[]{3, 2, 1});
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}
