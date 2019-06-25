package com.hly.dataStructure.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/24
 * @QQ :1136513099
 * @desc :计数排序
 */
public class CountingSort {

    /**
     * 平均        最快          最慢
     *O(n+k)      O(n+k)     O(n+k)
     * @param arrays
     * @return
     */
    public  static int [] countSort(int [] arrays){

        int c[] = new int[arrays.length];
        int b[] = new int[arrays.length];
        for(int i=0;i<arrays.length;i++){
            c[i] = 0;
        }
        for(int j =1 ;j<arrays.length;j++){
            c[arrays[j]]++;
        }
        for(int i =1;i<arrays.length;i++){
            c[i] = c[i]+c[i-1];
        }
        for(int j = arrays.length-1;j>=1;j--){
            b[c[arrays[j]]] = arrays[j];
            c[arrays[j]] -=1;
        }
        return b;
    }
    public static void main(String[] args){
        int []res = countSort(new int[]{0,2,4,1,1,5});
        for(int i:res)
            System.out.print(i+ " ");
    }
}
