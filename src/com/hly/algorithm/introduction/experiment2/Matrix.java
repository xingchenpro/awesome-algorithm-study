package com.hly.algorithm.introduction.experiment2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/7
 * @desc ：矩阵连乘
 */
public class Matrix {

    public static void main(String[] args){
        //int[] p = {30, 35, 15, 5, 10, 20, 25};
        int[] p = {4,3,5,2,3};
        int n = p.length-1 ;
        //存放计算代价
        int[][] m = new int[n+2][n+2];
        //存放分割标号k的值
        int[][] s = new int[n+2][n+2];
        //链长为1的最小计算代价为0，如A1,A2,A1 所对应[0.0],[1,1]，[2,2]的值是本身，也是0
        for(int i = 1; i <= n; i++){
            m[i][i] = 0;
        }
        //链长为2到n的最小计算代价
        for(int L = 2; L <= n; L++){
            //遍历的范围，逐渐缩小范围，从第一个开始。
            for(int i = 1; i <= n - L + 1; i++){//i范围依次小于 n-1,n-2,n-3
                //每次区间加1，遵从自底向上的递归形式求解。
                //i 到 j 的区间由 L决定
                int j = i + L -1;//L 是链的长度，也代表该区间下的最小代价，j比 i 大1
                //初始化m[i,j]的值为无限大。
                m[i][j] = Integer.MAX_VALUE;
                for(int k=i; k <=j-1; k++){
                    //递归求解公式，i 为第 i 个矩阵，p[i-1]为每一行上的数
                    int q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if(q < m[i][j]){
                        //保存序列代价的结果
                        m[i][j] = q;
                        //保存分割点k的值
                        s[i][j] = k;
                    }
                }
            }
        }



        //输出计算代价的矩阵m，其最终结果是矩阵m[0][m.length-1]
        System.out.println("该矩阵链的最小计算次数："+m[1][n]);
        for(int i=0; i <m.length; i++){
            for(int j=0; j <m.length; j++){
                System.out.print(m[i][j] +"          ");
            }
            System.out.println();
        }
        //构造最优解
        Matrix.printOptimalPatterns(s,0,n);
        System.out.println();
        for(int i=0; i <s.length; i++){
            for(int j=0; j <s[i].length; j++){
                System.out.print(s[i][j] +"          ");
            }
            System.out.println();
        }

    }

    static void printOptimalPatterns(int[][]s,int i, int j){
        if(i==j)
            System.out.print("A"+(i+1));//A从1开始，所以记得加1
        else{
            System.out.print("(");
            printOptimalPatterns(s,i,s[i][j]);// Ai,k的最优解 s[i,j]记录的是k的值
            printOptimalPatterns(s,s[i][j]+1,j);//Ak+1,j的最优解
            System.out.print(")");
        }
    }


}
//(A1(A2A3))((A4A5)A6)