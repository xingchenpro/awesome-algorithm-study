package com.hly.algorithmsCourse.experiment3;

import java.io.IOException;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/23
 * @QQ :1136513099
 * @desc :Matrix 最短路径(待完全理解)
 */
public class Matrix {
    public final static int MAX = Integer.MAX_VALUE;
    static String c[] = {"A", "B", "C", "D"};

    // 得到一个新的矩阵
    public static int[][] getNewMatrix(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                newMatrix[i][j] = MAX;
                for (int k = 0; k < matrix.length; k++) {
                    if (matrix[i][k]<MAX&&matrix[k][j]<MAX&&(matrix[i][k] + matrix[k][j] < newMatrix[i][j])) {//关键 matrix[i][k]<MAX&&matrix[k][j]<MAX
                        newMatrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                }
            }
        }
        return newMatrix;
    }

    // 配对路径
    public static int[][] getPairsPath(int[][] matrix) {
        int n = matrix.length;
        int L[][] = matrix;
        int m = 1; // m代表路径边数
        while (m < n ) {
            L = getNewMatrix(L);
            m*=2;
        }
        return  L;
    }


    public static void display(int[][] D) {
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D.length; j++) {
                if (i != j && D[i][j] == MAX)
                    System.out.print(c[i] + "到" + c[j] + "的最短路径为: " + "MAX" + "  ");
                else
                    System.out.print(c[i] + "到" + c[j] + "的最短路径为: " + D[i][j] + "    ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws IOException {
        int D[][] = {
                {0, 1, 5, 9},
                {1, 0, MAX, 2},
                {5, MAX, 0, 8},
                {9, 2, 8, 0}
        };
        int[][] path = getPairsPath(D);
        display(path);
    }


}
