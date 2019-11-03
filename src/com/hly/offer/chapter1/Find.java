package com.hly.offer.chapter1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/11/4
 * @QQ :1136513099
 * @desc : 4、二维数组中的查找
 */

/**
 * 题目：在一个二维数组中，每一行都按照从左到右递增顺序排序，每一列都按照从上到下递增顺序排序，输入一个二维数组和整数，判断数组中是否有该数.
 * 输入：{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}} ，8
 * 输出：true
 */

public class Find {

    public static boolean find(int[][] matrix, int num) {

        if (matrix == null) {
            return false;
        }
        int rows = matrix.length, cols = matrix[0].length;
        if (rows <= 0 || cols <= 0) {
            return false;
        }
        int row = 0;//第一行
        int col = cols - 1;//右上角，最后一列
        while (row < rows && col >= 0) {//注意这里的范围
            if (matrix[row][col] == num) {
                return true;
            } else if (matrix[row][col] > num) {
                col--;//剔除一列
            } else {
                row++;//剔除一行
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(find(matrix, 8));
        System.out.println(find(matrix, 15));
        System.out.println(find(matrix, 1));
        System.out.println(find(matrix, 14));
        System.out.println(find(matrix, -1));
        System.out.println(find(matrix, 18));
        System.out.println(find(null, 8));
    }
}
