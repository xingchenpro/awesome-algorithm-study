package com.hly.algorithms.experience2;

import java.io.*;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/1
 */
public class findLCS {

    public static String result = "";
    //'↖'
    // '↑'
    // '←'
    public static int[][] findLCS(String x, String y) {
        int m = x.length();
        int n = y.length();
        int c[][] = new int[m][n];
        int b[][] = new int[m][n];
        for (int i = 0; i < m; i++)
            c[i][0] = 0;
        for (int i = 0; i < n; i++)
            c[0][i] = 0;

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (x.charAt(i) == y.charAt(j)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                    b[i][j] = '↖';
                } else if (c[i - 1][j] >c[i][j - 1]) {
                    c[i][j] = c[i - 1][j];
                    b[i][j] = '↑';
                } else {
                    c[i][j] = c[i][j - 1];
                    b[i][j] = '←';
                }
        return b;

    }

    public static void LCS(int b[][],String x,int i,int j){
        if(i==0||j==0)
            return;
        if(b[i][j]=='↖'){
            LCS(b,x,i-1,j-1);
            System.out.print(x.charAt(i)+" ");
            result+=x.charAt(i);
        }
        else if(b[i][j]== '↑')
            LCS(b,x,i-1,j);
        else
            LCS(b,x,i,j-1);
    }

    public static void main(String[] args) throws IOException {

        //String x = " ABCBDAB", y = " BDCABA";//BCBA,BDAB
        String[] strings = new String[2];
        int i = 0;
        FileReader fileReader = new FileReader("d:/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null)
            strings[i++] = line;
        String x = strings[0], y = strings[1];
        int b[][] = findLCS(x, y);
        System.out.println("x和y的最长公共子序列为：");
        LCS(b, x, x.length() - 1, y.length() - 1);
        FileWriter fileWriter = new FileWriter("d:/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        fileWriter.write(result);
        fileWriter.flush();
        fileReader.close();
        bufferedReader.close();
        fileWriter.close();
        bufferedWriter.close();
        /*for(int k=1;k<b.length;k++) {
            for (int l = 1; l < b[k].length; l++) {
                System.out.print(String.valueOf(b[k][l]) + " ");
            }
            System.out.println();
        }*/
    }
}
