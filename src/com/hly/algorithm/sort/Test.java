package com.hly.algorithm.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/20
 * @QQ :1136513099
 * @desc :
 */
public class Test {


    public static void bubbo(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{5, 4, 3, 3, 1};
        bubbo(arrays);
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}

