package com.hly.OS;

import java.util.Scanner;

/**
 * @author :hly
 * @date :2018/6/15
 */
public class testGroupLinking {
    //每组3块
    static int[] freeGroup = new int[4];
    //可用磁盘快
    static int[][] groups = {{3, 1, 2, 3}, {3, 4, 5, 6,}, {0, 0, 0, 0}, {0, 0, 0, 0}, {3, 0, 7,8},{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
    //已分配的块
    static int allocations[] = new int[8];
    //已分配的块数
    static int allocationNum = 0;
    static Scanner scanner = new Scanner(System.in);


    //显示分组情况
    public static void display1() {
        int i, j, t = 0, count = 0;
        allocationNum = 0;
        if (freeGroup[1] != 0) {
            //一共有几块
            i = freeGroup[0];
            System.out.print("group1:");
            for (j = 1; j <= i; j++) {
                System.out.print(freeGroup[j] + " ");
                allocations[allocationNum] = freeGroup[j];
            }
            System.out.println();
            t = freeGroup[1];
            count = 2;
            while (groups[t][1] != 0) {
                System.out.print("group" + count+":");
                i = groups[t][0];
                for (j = 1; j <= i; j++) {
                    System.out.print(groups[t][j] + " ");
                    allocations[allocationNum++] = groups[t][j];
                }
                System.out.println();
                count++;
                t = groups[t][1];
            }
            System.out.print("group" + count+":");
            i = groups[t][0];
            for (j = 2; j < i ; j++) {
                if (groups[t][j] > 0) {
                    System.out.println(groups[t][j] + " ");
                    allocations[++allocationNum] = groups[t][j];
                }
            }
            System.out.println();
        } else {
            i = freeGroup[0];
            if (i == 1) {
                System.out.println("空闲快以经全部被分配");
            } else {
                System.out.print("group1:");
                for (j = 2; j <= i; j++) {
                    System.out.print(freeGroup[j]+" ");
                    allocations[allocationNum++] = freeGroup[j];
                }
                System.out.println();
            }
        }
    }

    public  static void display() {
        int i, j;
        if (freeGroup[0] != 0) {
            display1();
        } else {
            System.out.println("free0:");
            i = freeGroup[1];
            for (j = 0; j <= 3; j++)
                freeGroup[j] = groups[i][j];
                display1();
        }
    }

    //分配空闲快
    public static void allocate() {
        int s, i;
        //该组不止一个空闲快
        if (freeGroup[0] > 1) {
            i = freeGroup[0];
            s = freeGroup[i];
            freeGroup[0]--;
            System.out.println("分配的块号为 :" + s);
        }
        //只剩一个空闲快
        else if (freeGroup[0] == 1) {
            //还有其他空闲快组
            if (freeGroup[1] != 0) {
                s = freeGroup[1];
                for (i = 0; i <=3; i++)
                    groups[0][i] = groups[s][i];
                    freeGroup[0]--;
                    System.out.println("分配的块号为:" + s);

            } else {
                System.out.println("没有其他空闲快组");
                return;
            }
        }
        //当前组已经分配完
        else {
            System.out.println("当前组已分配完");
            for (i = 0; i <= 3; i++)
                freeGroup[i] = groups[0][i];
            //allocate();
        }
        display();
    }

    //回收空闲块
    public static void callback() {
        int i, j, t;
        System.out.println("输入你想回收的空闲快的号码:");

        j = scanner.nextInt();
        for (t = 1; t <= allocationNum; t++) {
            if (allocations[t] == j) {
                break;
            }
        }
        if (t < allocationNum + 1) {
            System.out.println("该空闲快已经存在");
            return;
        }
        //当前组不满三块
        if (freeGroup[0] < 3) {
            i = freeGroup[0];
            freeGroup[i + 1] = j;
            freeGroup[0]++;
        }
        //已有三块
        else {
            for (i = 0; i <= 3; i++)
                groups[j][i] = freeGroup[i];
            freeGroup[0] = 1;
            freeGroup[1] = j;
        }
        display();

    }

    public static void menu() {
        int i = scanner.nextInt();
        if(i==1)
            allocate();
        else if(i==2)
            callback();
        else
            System.out.println("无效的命令");
        System.out.println("是否需要继续操作:Y/N");
        String str = scanner.next();
        if(str.equals("Y"))
            menu();
        else
            display();
        System.out.println("已退出");

    }
    public static void main(String[] args) {
        for(int i =0 ;i<=3;i++)
            freeGroup[i] = groups[0][i];
        display();
        System.out.println("请输入操作：1:分配，2:回收");
        menu();
    }

}
