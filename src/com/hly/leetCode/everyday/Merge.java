package com.hly.leetCode.everyday;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/3
 * @QQ :1136513099
 * @desc : 面试题 10.01. 合并排序的数组
 * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 * 输入:
 * A = [1,2,3,0,0,0], m = 3
 * B = [2,5,6],       n = 3
 * 输出: [1,2,2,3,5,6]
 */
public class Merge {

    //解法1：要点，从后往前插入;A没有值;B没有值
    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1, j = n - 1, index = m + n - 1;
        //j<0说明B没有值，不成立,直接返回A
        while (j >= 0) {
            //i<0,直接把B赋值给A
            if (i < 0 || A[i] >= B[j]) {
                A[index--] = B[j--];
            } else {
                A[index--] = A[i--];
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 0, 0, 0};
        int[] A1 = new int[1];
        int[] B = {2, 5, 6};
        int[] B1 = {1};
        merge(A1, 0, B1, 1);
        for (int i = 0; i < A1.length; i++) {
            System.out.print(A1[i] + " ");
        }
    }
}
