package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/20
 * @QQ :1136513099
 * @desc :TODO 面试题04. 二维数组中的查找
 */
public class FindNumberIn2DArray {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length <= 0) {
            return false;
        }
        int col = 0, row = matrix[0].length - 1;
        //注意这里是大于或等于
        while (col < matrix.length && row >= 0) {
            if (matrix[col][row] > target) {
                row--;
            } else if (matrix[col][row] < target) {
                col++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}};

        int matrix2[][] = {{-5}};
        System.out.println(findNumberIn2DArray(matrix2, -5));
    }


}
