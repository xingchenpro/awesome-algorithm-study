package com.hly.backup.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/15
 * @QQ :1136513099
 * @desc : 796. 旋转字符串
 */

/**
 * 给定两个字符串, A 和 B。
 * A 的旋转操作就是将 A 最左边的字符移动到最右边。
 * 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea'。//abcdeabcde
 * 如果在若干次旋转操作之后，A 能变成B，那么返回True。
 */
public class RotateString {

    public static boolean rotateString(String A, String B) {
        if (A == null && B == null || A.length() == 0 && B.length() == 0)
            return true;
        if (A.length() != B.length())
            return false;
        StringBuilder stringBuilder = new StringBuilder(A);
        stringBuilder.append(A);
        return stringBuilder.indexOf(B) != -1;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "bcdea"));
    }
}
//思路1：A字符串相加两次，如果包含了B,说明A可以进行移动得到B