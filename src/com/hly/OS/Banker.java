package com.hly.OS;

import java.util.Scanner;

/**
 * @author :hly
 * @date :2018/5/5
 */
public class Banker {
    Scanner in = new Scanner(System.in);
    public int[] Available = {10, 5, 7};
    public int[][] Max = new int[5][3];
    public int[][] Allocation = new int[5][3];
    public int[][] Need = new int[5][3];
    public int[][] Request = new int[5][3];
    public int[] Work = new int[5];
    public int requestNum;

    public void setMax() {
        System.out.println("请分别输入5个进程的最大需求矩阵：");
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 3; j++)
                Max[i][j] = in.nextInt();
    }

    public void setAllocation() {
        System.out.println("请分别输入5个进程的分配矩阵：");
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 3; j++)
                Allocation[i][j] = in.nextInt();

        //设置Available
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                Available[i] = Available[i] - Allocation[j][i];

        //设置Need矩阵
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 3; j++)
                Need[i][j] = Max[i][j] - Allocation[i][j];
    }

    public void currentResource() {
        System.out.println("进程   Max     Alloction     Need      Available");
        for (int i = 0; i < 5; i++) {
            System.out.print("P" + i + "  ");
            for (int j = 0; j < 3; j++)
                System.out.print(Max[i][j] + "  ");
            System.out.print("|  ");
            for (int j = 0; j < 3; j++)
                System.out.print(Allocation[i][j] + "  ");
            System.out.print("|  ");
            for (int j = 0; j < 3; j++)
                System.out.print(Need[i][j] + "  ");
            System.out.print("|  ");
            if (i == 0)
                for (int j = 0; j < 3; j++)
                    System.out.print(Available[j] + "  ");
            System.out.println();
        }
    }



    //银行家算法
    public void bankerAlgorithm() {
        boolean flag = true;
        if (Request[requestNum][0] <= Need[requestNum][0] && Request[requestNum][1] <= Need[requestNum][1] && Request[requestNum][2] <= Need[requestNum][2]) {
            if (Request[requestNum][0] <= Available[0] && Request[requestNum][1] <= Available[1] && Request[requestNum][2] <= Available[2]) {
                for (int i = 0; i < 3; i++) {
                    Available[i] -= Request[requestNum][i];
                    Allocation[requestNum][i] += Request[requestNum][i];
                    Need[requestNum][i] -= Request[requestNum][i];
                }
            } else {
                flag = false;
                System.out.println("当前没有足够的资源分配进程P" + requestNum);
            }
        } else {
            flag = false;
            System.out.println("请求已经超出最大需求Need");
        }
        if (flag) {
            currentResource();
            System.out.println("开始安全算法");
            securityAlgorithm();
        }
    }

    //安全算法
    public void securityAlgorithm() {
        boolean[] finish = {false, false, false, false, false};
        int progressCount = 0;//已完成的进程数
        int circle = 0;//循环次数
        int[] serial = new int[5];//安全序列
        for (int i = 0; i < 3; i++)//工作量
            Work[i] = Available[i];
        while (progressCount < 5) {
            if (progressCount == 0)
                System.out.println("进程   Work     Alloction     Need      Work+Alloction");
            for (int i = 0; i < 5; i++) {
                //需要的小于当前可用的
                if (finish[i] == false && Need[i][0] <= Work[0] && Need[i][1] <= Work[1] && Need[i][2] <= Work[2]) {
                    System.out.print("P" + i + "   ");
                    for (int j = 0; j < 3; j++)
                        System.out.print(Work[j] + "  ");
                    System.out.print("|  ");
                    for (int j = 0; j < 3; j++)
                        //加上之前已经分配的
                        Work[j] += Allocation[i][j];
                    finish[i] = true;//完成第i条进程
                    progressCount++;
                    //serial[progressCount++] = i;//设置完成的进程顺序
                    for(int j=0;j<3;j++)
                        System.out.print(Allocation[i][j]+ "  ");
                    System.out.print("|  ");
                    for(int j=0;j<3;j++)
                        System.out.print(Need[i][j]+"  ");
                    System.out.print("|  ");
                    for(int j=0;j<3;j++)
                        System.out.print(Work[j]+"  ");
                    System.out.println();
                }
            }
            circle++;//for循环圈数
            if(progressCount==5){
                System.out.println("这是一个安全的序列，所以当前可以分配");
                break;
            }
            if(progressCount<circle){
                System.out.println("当前系统处于不安全状态");
                break;
            }
        }
    }
    public void setRequest() {
        System.out.println("请输入需要请求的进程编号：");
        requestNum = in.nextInt();
        System.out.println("请输入3种资源的数量：");
        for (int j = 0; j < 3; j++)
            Request[requestNum][j] = in.nextInt();
        bankerAlgorithm();
    }

    public static void main(String[] hly) {
        //boolean request = true;
        Banker banker = new Banker();
        banker.setMax();
        banker.setAllocation();
        banker.currentResource();
        banker.securityAlgorithm();
        while(true){
           banker.setRequest();
        }

    }


}
//7 5 3 3 2 2 9 0 2 2 2 2 4 3 3
//0 1 0 2 0 0 3 0 2 2 1 1 0 0 2