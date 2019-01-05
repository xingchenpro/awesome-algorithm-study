package com.hly.OS;

import java.util.Scanner;

/**
 * @author :hly
 * @date :2018/6/3
 */
public class testIndex {
    public static void main(String [] arv){
        Scanner scanner = new Scanner(System.in);
        int file,count,bsize,bnsize;
        System.out.println("请输入每个盘块的大小:");
        bsize = scanner.nextInt();
        System.out.println("请输入每个盘块号占的空间大小:");
        //间接得到一次间接地址可存放几个盘块号
        bnsize = scanner.nextInt();
        System.out.println("请输入文件的大小:");
        file = scanner.nextInt();
        //9504
        if(file>((10*bsize+(Math.pow((bsize/bnsize),1))*bsize)+(Math.pow((bsize/bnsize),2))*bsize)+(Math.pow((bsize/bnsize),3))*bsize){
            System.out.println("文件长度太大");
        }
        else{
            count = (file+bsize-1)/bsize;
            if(count<=10){
                System.out.println("该文件启动了直接索引");
                System.out.println("该文件占了第一块到"+count+"块");
                if(file%bsize==0)
                    System.out.println("若为地址则块内地址为"+bsize);
                else
                    System.out.println("若为地址则块内地址为"+(file/bsize - 1));
            }
            else if(count>10&&count<=10+bsize/bnsize){
                System.out.println("该文件启动了一级索引");
                System.out.println("该文件占了直接块和一级索引从第一块到到"+(count-10)+"块");
                if(file%bsize==0)
                    System.out.println("若为地址则块内地址为"+bsize);
                else
                    System.out.println("若为地址则块内地址为"+(file/bsize - 1));
            }
            else if(count>10+bsize/bnsize&&count<=10+bsize/bnsize+(bsize/bnsize)){
                    System.out.println("该文件启动了二级索引");
                    System.out.println("该文件占了直接块和一级索引和二级索引从第一块到到"+(count-10-bsize/bnsize)+"块");
                    if(file%bsize==0)
                        System.out.println("若为地址则块内地址为"+bsize);
                    else
                        System.out.println("若为地址则块内地址为"+(file/bsize - 1));
            }
            else{
                System.out.println("该文件启动了三级索引");
                System.out.println("该文件占了三级索引从第一块到到"+(count-10-bsize/bnsize-Math.pow((bsize/bnsize),2))+"块");
                if(file%bsize==0)
                    System.out.println("若为地址则块内地址为"+bsize);
                else
                    System.out.println("若为地址则块内地址为"+(file/bsize - 1));
            }
        }









    }
}
