package com.stardust.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/4/14
 * @desc : 04. 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //判断
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        //右上
        int row = 0, col = matrix[0].length - 1;
        //临界条件 >=0
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else if (matrix[row][col] > target) {
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int matrix2[][] = {
                {-5},
        };

        System.out.println(new FindNumberIn2DArray().findNumberIn2DArray(matrix, 5));
        System.out.println(new FindNumberIn2DArray().findNumberIn2DArray(matrix, 11));
        System.out.println(new FindNumberIn2DArray().findNumberIn2DArray(matrix2, -5));//true
    }
}
