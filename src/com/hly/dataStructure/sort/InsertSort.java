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

    public static void insertSort(int [] arrays){
        int j ,temp;
        for(int i =1;i<arrays.length;i++){
             temp = arrays[i];
             j = i-1;
             while (j>=0&&arrays[j]>temp){
                 arrays[j+1] = arrays[j];
                 j--;
             }
             arrays[j+1]= temp;
        }
    }

    public static void main(String[] args){
        int a [] = {2,4,1,3,5};//1 2 3 4 5
        insertSort(a);
        for(int i:a)
            System.out.print(i+" ");
    }
}
