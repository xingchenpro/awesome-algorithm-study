package com.hly.leetCode.offer.offer1;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/30
 * @QQ :1136513099
 * @desc : TODO 面试题66. 构建乘积数组 重点
 * 输入: [1,2,3,4,5]
 * 输出: [120,60,40,30,24]
 */
public class ConstructArr_66 {

    public static int[] constructArr(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0, j = 1; i < a.length; j *= a[i], i++) {//
            b[i] = j;
        }//1 1 2 6 24
        for (int i = a.length-1, j = 1; i >= 0; j *= a[i], i--) {
            b[i] *= j;
        }
        return b;
    }

    public static void main(String[] args){
        int []res = constructArr(new int[]{1,2,3,4,5});
        for (int re : res) {
            System.out.print(re+" ");
        }
    }
}
