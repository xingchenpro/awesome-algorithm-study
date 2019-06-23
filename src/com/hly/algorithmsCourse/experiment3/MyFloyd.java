package com.hly.algorithmsCourse.experiment3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/3
 * @QQ :1136513099
 * @desc :
 */
public class MyFloyd {

    static String c[] = {"A", "B", "C", "D"};
    private static int[][] D;
    public final static int MAX = Integer.MAX_VALUE;

    public MyFloyd(int D[][]) {
        this.D = D;
    }

    public static void Floyd() {
        int num = D.length;
        for (int k = 0; k < num; k++)
            for (int i = 0; i < num; i++)
                for (int j = 0; j < num; j++)
                    if(D[i][k]<MAX&&D[k][j]<MAX&&D[i][k]+D[k][j]<D[i][j])
                        D[i][j]=D[i][k]+D[k][j];
    }

    public static void display() {
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D.length; j++) {
                if (i != j && D[i][j] == 0)
                    System.out.print(c[i] + "到" + c[j] + "的最短路径为: " + "MAX" + "  ");
                else
                    System.out.print(c[i] + "到" + c[j] + "的最短路径为: " + D[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] arvs) throws IOException {
        int D[][] = {
                {0, 1, 5, 9},
                {1, 0, MAX, 2},
                {5, MAX, 0, 8},
                {9, 2, 8, 0}
        };

        MyFloyd myFloyd = new MyFloyd(D);
        Floyd();
        display();
        FileWriter fileWriter = new FileWriter("d:/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < myFloyd.D.length; i++) {
            for (int j = 0; j < myFloyd.D.length; j++) {
                bufferedWriter.write(c[i] + "到" + c[j] + "的最短路径为: " + D[i][j] + " ");
            }
            bufferedWriter.write("\r\n");
        }
        bufferedWriter.flush();
    }
}
