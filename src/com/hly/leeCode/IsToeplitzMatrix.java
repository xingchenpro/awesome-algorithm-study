package com.hly.leeCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/6
 * @QQ :1136513099
 * @desc : AC 766. 托普利茨矩阵
 */

/**
 * 如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
 * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
 */

public class IsToeplitzMatrix {

    //解法1，待优化
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=1;i<matrix.length;i++){
            for(int j = 1;j<matrix[i].length;j++){
                if(matrix[i][j]!=matrix[i-1][j-1])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };

        System.out.println(isToeplitzMatrix(matrix));
    }


}
