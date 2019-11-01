package com.hly.backup.offer.chapter2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc :11、旋转数组的最小数字
 */
public class Min {


    //解法1
    public int min(int[] array) {
        if (array == null || array.length == 0)
            return -1;
        int l = 0, h = array.length - 1;
        while (l < h) {
            //
            int m = l + (h - l) / 2;
            if (array[m] <= array[h])
                h = m;
            else
                l = m + 1;
        }
        return array[l];
    }

    //数组重复的情况下
    public int min2(int[] array) {
        if (array == null || array.length == 0)
            return -1;
        int l = 0, h = array.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (array[m] == array[l] && array[m] == array[h]) {
                return min2Duplicate(array, l, h);
            } else if (array[m] <= array[h]) {
                //前面的数较小，就把h往前
                h = m;
            } else {
                //前面的数较大，就把l往后
                l = m;
            }
        }
        return array[l];
    }

    public int min2Duplicate(int[] array, int l, int h) {
        for (int i = l; i < h; i++)
            if (array[i] > array[i + 1])
                return array[i + 1];
        return array[l];
    }

    public static void main(String[] args) {
        System.out.println(new Min().min2(new int[]{3, 4, 5, 1, 2}));
        System.out.println(new Min().min2(new int[]{6, 7, 3, 4, 5}));
        System.out.println(new Min().min2(new int[]{1, 1, 1, 0, 1}));
    }
}
