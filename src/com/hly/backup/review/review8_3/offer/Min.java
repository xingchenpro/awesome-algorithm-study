package com.hly.backup.review.review8_3.offer;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc :11、旋转数组的最小数字
 */
public class Min {

    public int min(int[] array) {
        if (array == null || array.length == 0)
            return -1;
        int l = 0, h = array.length - 1;
        while (l < h) {
            int m = (l+h)/2;
            if (array[m] == array[l] && array[m] == array[h]) {
                return duplita(array, l, h);
            } else if (array[m] > array[l]) {
                //前面的数较小，就把h往前
                l = m+1;
            } else {
                //前面的数较大，就把l往后,todo 这里注意边界
                h = m;
            }
        }
        return array[l];
    }

    public int duplita(int[] array, int l, int h) {
        for (int i = l; i < h; i++)
            if (array[i] > array[i + 1])
                return array[i + 1];
        return array[l];
    }

    public static void main(String[] args) {
        System.out.println(new Min().min(new int[]{3, 4, 5, 1, 2}));
        System.out.println(new Min().min(new int[]{6, 7, 3, 4, 5}));
        System.out.println(new Min().min(new int[]{1, 1, 1, 0, 1}));
    }
}
