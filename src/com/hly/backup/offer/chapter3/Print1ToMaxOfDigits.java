package com.hly.backup.offer.chapter3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc :todo 17、打印从1到最大的n位数
 */
public class Print1ToMaxOfDigits {

    //'0'其实是个整型数，也就是ASCII表里面 '0'~'9'的起始位置。
//所以对整形数 i=0~9的范围，putchar（i+'0'）相当于输出字符 ' i'。

    public void print1ToMaxOfDigits(int n) {

        if (n <= 0)
            return;
        char[] num = new char[n];
        print1ToMaxOfDigits(num,0);
    }

    public void print1ToMaxOfDigits(char[] num, int index) {

        if (index == num.length) {
            printBumber(num);
            return;
        }
        for (int i = 0; i < 10; i++) {
            num[index] = (char) (i + '0');
            print1ToMaxOfDigits(num, index + 1);
        }
    }

    public void printBumber(char[] num) {

        int index = 0;
        while (index < num.length && num[index] == '0')
            index++;
        while (index < num.length)
            System.out.print(num[index++]);
        System.out.println();
    }


    public static void main(String[] args){

        new Print1ToMaxOfDigits().print1ToMaxOfDigits(3);

    }
}


