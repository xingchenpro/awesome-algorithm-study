package com.hly.algorithms.two;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/5
 */
public class InsertionSort {

    //2 5 4 6 1 3
    //2 4 5 6 1 3
    //1 2 4 5 6 3
    //1 2 3 4 5 6

    //插入排序升序
    public static int[] insertionSortOfOrder(int arrays[]) {
        int temp, i;
        for (int j = 1; j < arrays.length; j++) {
            temp = arrays[j];
            i = j - 1;
            while (i >= 0 && arrays[i] > temp) {
                arrays[i + 1] = arrays[i];//大的数向后移动
                i = i - 1;
            }
            arrays[i + 1] = temp;//之前大的数覆盖了小的数，这里换回来,i+1是由于上一步的i减了1
        }
        return arrays;
    }

    //插入排序降序
    public static int[] insertionSortOfDesc(int arrays[]) {
        int temp, i;
        for (int j = 1; j < arrays.length; j++) {
            temp = arrays[j];
            i = j - 1;
            while (i >= 0 && arrays[i] < temp) {
                arrays[i + 1] = arrays[i];
                i--;
            }
            arrays[i + 1] = temp;
        }
        return arrays;
    }

    public static void main(String[] args) {
        int arrays[] = {5, 2, 4, 6, 1, 3};
        insertionSortOfOrder(arrays);
        insertionSortOfDesc(arrays);
        for (int i : arrays) {
            System.out.print(i + " ");
        }
    }

}
