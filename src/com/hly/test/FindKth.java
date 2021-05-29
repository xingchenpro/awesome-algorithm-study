package com.hly.test;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc :
 */
public class FindKth {

    int[] heap;

    public int findKth(int[] arr, int k) {
        heap = new int[k];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1 && j <k) {
                heap[j++] = arr[i];
            }
        }

        //先进行堆有序。
        for (int i = (k - 1) / 2; i >= 0; i--)
            sink(i, k);
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < heap[0]) {
                heap[0] = arr[i];
                sink(0, k);
            }
        }
        return heap[0];
    }

    private void sink(int i, int N) {
        while ((2 * i + 1) <= N - 1) {
            int j = 2 * i + 1;
            if (j < N - 1 && heap[j] < heap[j + 1]) j++;
            if (heap[i] > heap[j]) break;
            exch(i, j);
            i = j;
        }
    }

    private void exch(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4, 7, 6, 8, 9};
        System.out.println(new FindKth().findKth(arr, 3));
    }
}
