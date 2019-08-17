package com.hly.offer.chapter5;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/1
 * @QQ :1136513099
 * @desc :39、数组中出现次数超过一半的数字
 */
public class MoreThanHalfNum {

    public int moreThanHalfNum(int[] array) {
        if (array == null || array.length == 0)
            return -1;
        int count = 1;
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (count == 0) {
                result = array[i];
            } else if (result == array[i]) {
                count++;
            } else {
                count--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 2, 2, 2, 3};
        int[] array2 = {3, 3, 1, 3, 2, 2, 2, 3};
        System.out.println(new MoreThanHalfNum().moreThanHalfNum(array2));
        System.out.println(new MoreThanHalfNum().moreThanHalfNum(array));
    }
}
