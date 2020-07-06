package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/5
 * @desc : * 168. Excel表列名称/
 * https://leetcode-cn.com/problems/excel-sheet-column-title/
 */
public class ConvertToTitle {

    //A 65
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n -= 1;
            sb.append((char) (n % 26 + 65));
            n /= 26;
        }
        return sb.reverse().toString();
    }

    //    1 -> A
    //    2 -> B
    //    3 -> C
    //    ...
    //    26 -> Z
    //    27 -> AA
    //    28 -> AB
    public static void main(String[] args) {
        System.out.println(new ConvertToTitle().convertToTitle(28));//AB
        System.out.println(new ConvertToTitle().convertToTitle(26));//Z
        System.out.println(new ConvertToTitle().convertToTitle(56));//
    }


}
