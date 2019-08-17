package com.hly.review.review8_5;

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
        int count = 1;
        int res = array[0];
        for (int i = 1; i < array.length; i++) {

            if (count == 0) {
                res = array[i];
            }
            count += (res == array[i] ? 1 : -1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 2, 2, 2, 3};
        int[] array2 = {3, 3, 1, 3, 2, 2, 2, 3};
        System.out.println(new MoreThanHalfNum().moreThanHalfNum(array));
        System.out.println(new MoreThanHalfNum().moreThanHalfNum(array2));
    }
}
