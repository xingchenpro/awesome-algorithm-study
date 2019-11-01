package com.hly.os;

import java.util.Scanner;

/**
 * @author :hly
 * @date :2018/6/24
 */
public class SCAN {

    static Scanner scanner = new Scanner(System.in);
    //请求序列长度
    static int length;
    //存放序列
    static int[] arrays;
    //最短路径
    static int[] arraysAfter;
    //经过的最短长度
    static int sumLength = 0;
    //开始位置
    static int start;
    //开始方向,0为里，1为外
    static int direction;

    static int MIN_NUM = Integer.MAX_VALUE;

    //输入
    public static void input() {
        System.out.println("请输入请求序列的长度:");
        length = scanner.nextInt();
        arrays = new int[length];
        arraysAfter = new int[length];
        System.out.println("请输入请求的序列:");
        for (int i = 0; i < length; i++)
            arrays[i] = scanner.nextInt();
        System.out.println("请输入开始扫描的位置:");
        start = scanner.nextInt();
        System.out.println("请输入磁道增加的方向,0为向里,1为向外:");
        direction = scanner.nextInt();
    }

    public static void SCAN() {
        int thisMinPoint = start;
        int num = length;
        int thisIndex = 0;
        int after = 0;
        while (num > 0) {
            boolean flag = false;
            for (int i = 0; i < length; i++) {
                //向外
                if (direction == 1 && arrays[i] != -1 && Math.abs(thisMinPoint - arrays[i]) < MIN_NUM && arrays[i] > thisMinPoint) {
                    MIN_NUM = Math.abs(thisMinPoint - arrays[i]);
                    thisIndex = i;
                    flag = true;
                }
                //向里
                else if (direction == 0 && arrays[i] != -1 && Math.abs(thisMinPoint - arrays[i]) < MIN_NUM && arrays[i] < thisMinPoint) {
                    MIN_NUM = Math.abs(thisMinPoint - arrays[i]);
                    thisIndex = i;
                    flag = true;
                }
            }

            //循环完一次转向
            if (direction == 1&&flag==false)
                direction = 0;
            else if (direction == 0&&flag==false)
                direction = 1;

            if(flag==true) {
                num--;
                //System.out.println("MIN_NUM:"+MIN_NUM);
                thisMinPoint = arrays[thisIndex];
                sumLength += MIN_NUM;
                MIN_NUM = Integer.MAX_VALUE;
                arraysAfter[after++] = arrays[thisIndex];
                arrays[thisIndex] = -1;
            }
        }

    }


    //输出结果
    public static void output() {
        System.out.println("总路线长度为:" + sumLength);
        System.out.println("平均查找长度为:" + sumLength / length);
        System.out.println("查找路径为:");
        for (int i : arraysAfter)
            System.out.print(i + " ");
    }


    public static void main(String[] args) {
        //98 183 37 122 14 124 65 67
        //150 160 184 90 58 55 39 38 18
        input();
        SCAN();
        output();

    }
}
