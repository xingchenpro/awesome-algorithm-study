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

    /**
     * 平均        最快       最慢
     * O(n^2)      O(n)      O(n^2)
     *
     * @param arrays
     */

    public static void bubbleSort(int arrays[]) {
        boolean flag = true;
        for (int i = 1; i < arrays.length; i++) {
            flag = true;
            for (int j = 0; j < arrays.length - i; j++) {//j = 3,2,1
                if (arrays[j] > arrays[j + 1]) {
                    arrays[j] = arrays[j] + arrays[j + 1];
                    arrays[j + 1] = arrays[j] - arrays[j + 1];
                    arrays[j] = arrays[j] - arrays[j + 1];
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 3, 1, 4, 2};
        bubbleSort(a);
        for (int i : a)
            System.out.print(i + " ");
    }
}
