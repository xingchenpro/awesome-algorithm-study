package com.hly.dataStructure.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/12
 */
//带监视哨的直接插入排序
public class InsertSortWithGuard {

    public static void insertSortWithGuard(int[] arrays){
        int j;
        for(int i=2;i<arrays.length;i++){
            arrays[0] = arrays[i];
            j = i-1;
            while (arrays[0]<arrays[j]){//不需要判断数组是否越界，arrays[0] == arrays[i] 必然成立
                arrays[j+1] = arrays[j];
                j--;
            }
            arrays[j+1] = arrays[0];
        }
    }

    public static void main(String[] args){
        int a [] = {0,2,4,1,3,5};
        insertSortWithGuard(a);
        for (int i=1;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
