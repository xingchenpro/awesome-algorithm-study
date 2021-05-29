package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/21
 * @QQ :1136513099
 * @desc : TODO 面试题66. 构建乘积数组
 */
public class ConstructArr {

    public int[] constructArr(int[] a) {

        int[] b = new int[a.length];
        //第一遍，从前往后乘当前数之前的数
        for (int i = 0, j = 1; i < a.length; j *= a[i], i++) {
            b[i] = j;
        }
        //第二遍，从后往前乘当前数之后的数
        for (int i=a.length-1,j=1;i>=0;j*=a[i],i--){
            b[i]*=j;
        }
        return b;
    }
    //输入: [1,2,3,4,5]
    //输出: [120,60,40,30,24]
    //第一遍 1 1 2 6 24
    //第二遍 120 60 40 30 24

}
