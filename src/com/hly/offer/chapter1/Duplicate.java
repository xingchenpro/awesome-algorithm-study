package com.hly.offer.chapter1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/11/2
 * @QQ :1136513099
 * @desc :3、数组中的重复元素
 */

/**
 * 题目：找出数组中的重复数字
 * 描述：在一个长度为 n 的数组里面，的所有数字都在 0~n-1的范围内，数组中的某些数字是重复的，但不知道有几个数字重复，找出任意一个重复的数字
 * 输入：{2,3,1,0,2,5,3}
 * 输出：2 或 3
 */
public class Duplicate {

    public static int duplicate(int[] array) {
        if (array == null || array.length <= 0) {
            return -1;
        }
        for (int i : array) {
            if(i<0||i>array.length-1){
                return -1;
            }
        }
        //遍历数组
        for (int i = 0; i < array.length; i++) {
                //如果下标不等于数组当前值,这里 while 循环一直判断，直到找到相等的
                while (array[i] != i) {
                    //获得数组的值
                    int t = array[i];
                    //把当前数组的值放到他所对应的下标下，比如 a[i]=5,把他放到a[5]下面
                    if (array[i] != array[t]) {
                        int temp = array[i];
                        array[i] = array[t];
                        array[t] = temp;
                        //如果a[i]等于a[t]，说明a[t]已经存在了相同的数字
                    } else {
                        //返回重复数字
                        return array[i];
                    }
                }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(duplicate(new int[]{2, 3, 1, 0, 2, 5, 3}));
        System.out.println(duplicate(new int[]{3, 1, 0, 2, 5, 3}));
        System.out.println(duplicate(new int[]{0, 1, 2, 4, 3}));
        System.out.println(duplicate(null));
        System.out.println(duplicate(new int[]{0, 1, 2, 4, 7}));
        System.out.println(duplicate(new int[]{0, 1, 2, 4, -2}));

    }
}

