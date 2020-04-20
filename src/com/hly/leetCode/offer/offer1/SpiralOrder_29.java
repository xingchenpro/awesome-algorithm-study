package com.hly.leetCode.offer.offer1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/8
 * @QQ :1136513099
 * @desc : TODO 面试题29. 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 */
public class SpiralOrder_29 {

    //四个变量代表四个方向，遍历完一个方向，修改该方向的值，遍历完一个方向判断是否遍历完成
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[]{};
        }
        int index = 0;
        int[] res = new int[matrix.length * matrix[0].length];
        int left = 0, top = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
        while (true) {
            for (int i = left; i <= right; i++) {
                res[index++] = matrix[top][i];
            }
            top++;
            if (top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                res[index++] = matrix[i][right];
            }
            right--;
            if (left > right) {
                break;
            }
            for (int i = right; i >= left; i--) {
                res[index++] = matrix[bottom][i];
            }
            bottom--;
            if (top > bottom) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                res[index++] = matrix[i][left];
            }
            left++;
            if (left > right) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] res = spiralOrder(matrix);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }


}
