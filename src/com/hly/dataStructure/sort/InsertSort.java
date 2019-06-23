package com.hly.dataStructure.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/12
 */

//直接插入排序
public class InsertSort {

    /**
     *   平均        最快       最慢
     *   O(n^2)      O(n)      O(N^2)
     * @param arrays
     */
    public static void insertSort(int [] arrays){
       for(int j =1 ;j<arrays.length;j++){
           int key = arrays[j];
           int i = j-1;
           while (i>=0&&arrays[i]>key){
               arrays[i+1] = arrays[i];
               i--;
           }
           arrays[i+1] = key;
       }
    }
    public static void main(String[] args){
        int a [] = {2,4,1,3,5};//1 2 3 4 5
        insertSort(a);
        for(int i:a)
            System.out.print(i+" ");
    }
}
