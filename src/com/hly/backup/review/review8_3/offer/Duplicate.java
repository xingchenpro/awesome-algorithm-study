package com.hly.backup.review.review8_3.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/29
 * @QQ :1136513099
 * @desc : 3、数组中的重复数字
 */
public class Duplicate {

    //解法1 数组排序
    public int duplicate(int[] array) {
        if(array==null||array.length==0)
            return 0;
        for(int i=0;i<array.length;i++){
            int key = array[i];
            int  j = i-1;
            while (j>=0&&array[j]>key){
                array[j+1] =array[j];
                j--;
            }
            array[j+1] = key;
        }
        for(int i=1;i<array.length;i++){
            if(array[i]==array[i-1])
                return array[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(new Duplicate().duplicate(new int[]{3, 2, 1, 1, 4}));
        System.out.println(new Duplicate().duplicate(new int[]{3, 2, 4, 1, 4}));
        System.out.println(new Duplicate().duplicate(new int[]{3, 2, 4, 1, 5}));
        System.out.println(new Duplicate().duplicate(new int[]{}));
        System.out.println(new Duplicate().duplicate(null));
    }

}
