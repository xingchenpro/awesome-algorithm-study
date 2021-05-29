package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/21
 * @QQ :1136513099
 * @desc : 66. 加一/
 * https://leetcode-cn.com/problems/plus-one/
 */
public class PlusOne {

    //进位多出一位数，移动数组？
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                //当前下标为0，进位
                digits[i] = 0;
            }
        }
        //循环结束，没有返回结果，说明全部为9
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] res = plusOne.plusOne(new int[]{9});
        for (int re : res) {
            System.out.print(re + " ");
        }
        System.out.println();
        int[] res2 = plusOne.plusOne(new int[]{0});
        for (int re : res2) {
            System.out.print(re + " ");
        }
    }
}
