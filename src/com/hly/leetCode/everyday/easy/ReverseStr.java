package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/10/1
 * @desc : 541. 反转字符串 II
 * https://leetcode-cn.com/problems/reverse-string-ii/
 */
public class ReverseStr {

    //每隔k个反转k个，末尾不够k个时全部反转
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < s.length(); i += 2 * k) {
            if (i + k - 1 < n - 1) {
                sb.append(reverse(s.substring(i, i + k - 1)));
            } else {
                sb.append(reverse(s.substring(i, s.length() - 1)));
            }
            sb.append(s.substring(i+k-1,2*k));
        }
        return sb.toString();
    }

    private String reverse(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        while (i < j) {
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++;
            j--;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseStr().reverseStr("abcdefg", 2));//bacdfeg
        System.out.println(new ReverseStr().reverse("abcdefg"));


    }
}
