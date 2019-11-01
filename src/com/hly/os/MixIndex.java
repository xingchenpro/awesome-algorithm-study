package com.hly.os;

import java.util.Scanner;

/**
 * @author :hly
 * @date :2018/6/10
 */
public class MixIndex {

    public static void main(String[] arv) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入每个盘块大小：");
        double blockSize = scanner.nextInt();
        System.out.println("请输入每个盘块号所占的空间大小：");
        int blockNumSpaceSize = scanner.nextInt();
        System.out.println("请输入文件的大小：");
        int fileSize = scanner.nextInt();
       /* System.out.println("请输入一个需要访问的地址:");
        int visitAddress = scanner.nextInt();*/

        //定义数据结构
        double[] blocks = new double[13];
        for (int i = 0; i < 13; i++) {
            if (i >= 0 && i < 10)
                //存放直接地址
                blocks[i] = blockSize;
                //间接地址，文件最大可分配大小
            else if (i == 10)
                blocks[i] = (int) Math.pow((blockSize / blockNumSpaceSize), 1) * blockSize;
            else if (i == 11)
                blocks[i] = (int) Math.pow((blockSize / blockNumSpaceSize), 2) * blockSize;
            else
                blocks[i] = (int) Math.pow((blockSize / blockNumSpaceSize), 3) * blockSize;
        }

        //文件最大大小
        int maxSize = 0;
        for (double j : blocks)
            maxSize += j;
        System.out.println("允许文件最大大小为:"+maxSize);

        if (fileSize > maxSize) {
            System.out.println("对不起，您输入的文件大于" + maxSize + "B");
        } else {

            if (fileSize <= (blockSize * 10)) {
                System.out.println("该文件启动了直接索引");
                System.out.println("该文件占据了第一块到第" + Math.ceil(fileSize / blockSize) + "块");
            } else if (fileSize > (blockSize * 10) && fileSize < (blockSize * 10) + blocks[10]) {
                System.out.println("该文件启动了直接索引和一级索引");
                System.out.println("该文件占据了直接索引和以及一级索引的第一块到第" + Math.ceil((fileSize - (blockSize * 10)) / (blocks[10]/8)) + "块");
                System.out.println("若为地址则该地址所在盘块号为到第" + (9 + Math.ceil((fileSize - (blockSize * 10)) / blockSize)) + "块");
                System.out.println(Math.ceil((fileSize - (blockSize * 10)) / blockSize));
            } else if (fileSize >= (blockSize * 10) + blocks[10] && fileSize < (blockSize * 10) + blocks[10] + blocks[11]) {
                System.out.println("该文件启动了直接索引和一级索引,二级索引");
                System.out.println("该文件占据了直接索引,一级索引和二级索引的第1块到第" + Math.ceil((fileSize - (blockSize * 10) - blocks[10]) / (blocks[11]/8)) + "块");
                System.out.println("若为地址则该地址所在的盘块号为到第:" + (9 + Math.pow(blockSize / blockNumSpaceSize, 1) + Math.ceil((fileSize - (blockSize * 10) - blocks[10])) / blockSize)+"块");
            } else {
                System.out.println("该文件启动了直接索引和一级索引二级索引,三级索引");
                System.out.println("该文件占据了直接索引,一级索引,二级索引和三级索引的第1块到第" + (Math.ceil((fileSize - blockSize * 10 - blocks[10] - blocks[11]) / (blocks[12]/8))) + "块");
                System.out.println("若为地址则该地址所在的盘块号为到第:" + (9 + Math.pow(blockSize / blockNumSpaceSize, 1) + Math.pow(blockSize / blockNumSpaceSize, 2) + (Math.ceil((fileSize - (blockSize * 10) - blocks[10] - blocks[11]) / blockSize)))+"块");
            }
        }
    }


    //9504
}

