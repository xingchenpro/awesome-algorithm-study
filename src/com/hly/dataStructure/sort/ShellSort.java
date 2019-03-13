package com.hly.dataStructure.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/12
 */
//希尔排序,插入排序的分治算法
public class ShellSort {

    public static void shellSort(int[] arrays, int d[]) {
        int i, j, temp;
        for (int k = 0; k < d.length; k++) {
            int dk = d[k];
            for (i = dk; i < arrays.length; i++) {
                temp = arrays[i];
                j = i - dk;
                while (j >= 0 && arrays[j] > temp) {
                    arrays[j + dk] = arrays[j];
                    j -= dk;
                }
                arrays[j + dk] = temp;
            }
        }
    }
    public static void main(String[] args) {

        int a[] = {52, 39, 67, 95, 70, 8, 25, 52, 56,5};
        int d[] = {5, 3, 1};
        shellSort(a,d);
        for (int i:a)
            System.out.print(i+" ");
    }
}
