package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/21
 * @QQ :1136513099
 * @desc : 67. 二进制求和(输出字符串的二进制和)/
 * https://leetcode-cn.com/problems/add-binary/
 */
public class AddBinary {


    //解法1：逐位计算
    public String addBinary(String a, String b) {
        int n = a.length(), m = b.length();
        //n 需要大于 m
        if (n < m) return addBinary(b, a);
        //进位值 carry 的长度
        int l = Math.max(n, m);

        //保存结果
        StringBuilder sb = new StringBuilder();
        //初始化进位为 0
        int carry = 0, j = m - 1;
        for (int i = l - 1; i >= 0; i--) {
            //低位为1，则进位++
            if (a.charAt(i) == '1') {
                carry++;
            }
            if (j >= 0 && b.charAt(j--) == '1') {
                carry++;
            }
            //进位为1，当前位的结果为1，为0则当前位结果为0
            if (carry % 2 == 1) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            //右移一位(等于除以2),将最高位移至下一位继续计算
            carry >>= 1;
        }
        //for 循环借宿，进位值如果为1，则加上
        if (carry == 1) {
            sb.append("1");
        }
        //因为 append是从前往后添加的，所以要翻转过来
        sb.reverse();
        return sb.toString();
    }

    //解法2：数太大异常
    public String addBinary2(String a, String b) {
        //Integer.parseInt(a, 2); 二进制转化为十进制,的、第二个参数如果为 16 则为十六进制转十进制；8 为八进制
        //十进制结果求和转化为二进制
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }


    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("11", "1"));
        System.out.println(new AddBinary().addBinary("1111", "10"));//10001
        //System.out.println(Integer.parseInt("12", 8));
    }
}
