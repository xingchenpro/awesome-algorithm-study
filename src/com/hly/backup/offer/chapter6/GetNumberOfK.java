package com.hly.backup.offer.chapter6;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/2
 * @QQ :1136513099
 * @desc :53、在排序数组中出现的次数
 */
public class GetNumberOfK {

    public int getNumberOfK(int [] array,int n){
        if(array==null||array.length==0)
            return -1;
        int first = searchNumberOfK(array,n);
        int last = searchNumberOfK(array,n+1);
        return last-first;
    }

    public int searchNumberOfK(int [] array,int n){
        int l = 0,h = array.length-1;
        while (l<h){
            //int m= (l+h)/2;
            int m = l+(h-l)/2;
            if(array[m]>=n)
                h = m;
            else
                l = m+1;
        }
        return l;
    }

    public static void main(String[] args){
        System.out.println(new GetNumberOfK().getNumberOfK(new int[]{1, 2, 3, 3, 3, 3, 4, 5}, 3));
    }
}
