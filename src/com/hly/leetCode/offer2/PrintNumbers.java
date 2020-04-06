package com.hly.leetCode.offer2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/6
 * @QQ :1136513099
 * @desc : AC 面试题17. 打印从1到最大的n位数
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 */
public class PrintNumbers {

    public int[] printNumbers(int n) {
        int[] nums = new int[(int) (Math.pow(10, n) - 1)];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] res = new PrintNumbers().printNumbers(3);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }

}
