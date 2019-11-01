package com.hly.backup.offer.chapter2;

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

        if (array == null || array.length == 0)
            return -1;
        for (int i = 0; i < array.length; i++)
            if (array[i] < 0 || array[i] > array.length - 1)
                return -1;
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                return array[i];
            }
        }
        return -1;
    }

    //解法2 哈希表
    public int duplicate2(int[] array) {
        //数组不能为空
        if (array == null || array.length == 0)
            return -1;
        //满足数字大小为0-n-1
        for (int i = 0; i < array.length; i++)
            if (array[i] < 0 || array[i] > array.length - 1)
                return -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], array[i]);
            } else {
                return array[i];
            }
        }
        return -1;
    }

    //解法3 根据元素范围为 0-n-1，将值为i的元素调整到i位置上
    public int duplicate3(int[] array) {
        //数组不能为空
        if (array == null || array.length == 0)
            return -1;
        //满足数字大小为0-n-1
        for (int i = 0; i < array.length; i++)
            if (array[i] < 0 || array[i] > array.length - 1)
                return -1;

        for (int i = 0; i < array.length; i++) {
          while (array[i]!=i){
              if(array[i]==array[array[i]]){
                  return array[i];
              }
              int t = array[i];
              array[i] = array[t];
              array[t] = t;
          }
        }
        return -1;
    }


    public static void main(String[] args) {

        System.out.println(new Duplicate().duplicate3(new int[]{3, 2, 1, 1, 4}));
        System.out.println(new Duplicate().duplicate3(new int[]{3, 2, 4, 1, 4}));
        System.out.println(new Duplicate().duplicate3(new int[]{3, 2, 4, 1, 5}));
        System.out.println(new Duplicate().duplicate3(new int[]{}));
        System.out.println(new Duplicate().duplicate3(null));
    }
}
