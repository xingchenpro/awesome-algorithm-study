package com.hly.leetCode.offer.offer3;

import java.util.Arrays;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/28
 * @QQ :1136513099
 * @desc :
 */
public class MinNumber {

    //解法2:自定义排序函数 compareTo()函数
    //1、如果指定的数与参数相等返回0。
    //2、如果指定的数小于参数返回 -1。
    //3、如果指定的数大于参数返回 1。
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        //TODO
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));//330 -303 >0
        StringBuilder res = new StringBuilder();
        for (String s : strs)
            res.append(s);
        return res.toString();

    }


    public static void main(String[] args) {
        System.out.println("");
    }
}
