package com.hly.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc : 归并排序
 */
public class MergeSort {

    public static void merge(int[] arrays, int p, int q, int r) {

        int[] temp = new int[arrays.length];
        int i = p, j = q + 1, k = p;
        while (i <= q && j <= r) {
            if (arrays[i] <= arrays[j]) {
                temp[k++] = arrays[i++];
            } else {
                temp[k++] = arrays[j++];
            }
        }
        while (i <= q)
            temp[k++] = arrays[i++];
        while (j <= r)
            temp[k++] = arrays[j++];
        //将temp从索引p位置开始，赋值到arrays索引p的位置，赋值r-p+1个数
        System.arraycopy(temp,p,arrays,p,r-p+1);
    }

    public static void mergeSort(int[] arrays, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(arrays, p, q);
            mergeSort(arrays, q + 1, r);
            merge(arrays, p, q, r);
        }
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{5, 2, 3, 4, 1};
        mergeSort(arrays, 0, arrays.length - 1);
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}
