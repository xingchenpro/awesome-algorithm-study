package com.hly.algorithms.experience2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/6
 */
public class findLCS {
    public static int[][] LCSLength ( String[] x, String[] y) {
        int m = x.length;
        int n = y.length;
        int[][] b = new int[x.length][y.length];
        int[][] c = new int[x.length][y.length];
        for(int i = 1; i < m; i++) {
            c[i][0] = 0;
        }
        for(int i = 1; i < n; i++) {
            c[0][i] = 0;
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(x[i] == y[j]) {
                    c[i][j] = c[i-1][j-1] + 1;
                    b[i][j] = 1;
                }
                else if(c[i-1][j] >= c[i][j-1]) {
                    c[i][j] = c[i-1][j];
                    b[i][j] = 2;
                }
                else {
                    c[i][j] = c[i][j-1];
                    b[i][j]=3;
                }
            }
        }
        return b;
    }

    public static void LCS(int[][] b, String[] x, int i, int j) {
        if(i == 0|| j == 0) return;
        if(b[i][j] == 1) {
            LCS(b,x,i - 1, j - 1);
            System.out.print(x[i] + " ");
        }
        else if(b[i][j] == 2) {
            LCS(b,x,i - 1, j);
        }
        else LCS(b,x,i, j-1);
    }
    public static void main(String[] args){
        String[] x = {" ","A", "B", "C", "B", "D", "A", "B"};
        String[] y = {" ","B", "D", "C", "A", "B", "A"};
        int[][] b = LCSLength(x, y);
        System.out.println("X和y的最长公共子序列是：");
        LCS(b, x, x.length - 1, y.length - 1);
    }

}

