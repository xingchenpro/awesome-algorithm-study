package com.hly.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : 面试题17. 打印从1到最大的n位数
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 */
public class PrintNumbers {

    public int[] printNumbers(int n) {
        //注意长度
        int [] res = new int[(int) (Math.pow(10,n)-1)];
        for (int i=0;i<res.length;i++){
            res[i] = i+1;
        }
        return res;
    }
    public static void main(String[] args){
        int []res = new PrintNumbers().printNumbers(1);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }


}
