package com.hly.leetCode.offer.offer1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/2/26
 * @QQ :1136513099
 * @desc : 面试题04. 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindNumberIn2DArray_04 {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        //从左下角开始查找，r为行，c为列
        int r = matrix.length - 1;
        int c = 0;
        while (r >= 0 && c < matrix[0].length) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] < target) {
                //如果目标值大于当前值，剔除一列
                c++;
                //目标值小于当前值，剔除一行
            } else {
                r--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}};
        System.out.println(findNumberIn2DArray(matrix, 8));
    }
}
