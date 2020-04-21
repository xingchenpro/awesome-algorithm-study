package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/21
 * @QQ :1136513099
 * @desc : 面试题65. 不用加减乘除做加法
 */
public class Add {

    /**
     * 异或(无进位和）：两个值不相同，结果为1，两个值相同结果为0，异或也叫半加运算，其运算法则相当于不带进位的二进制加法
     * &（有进位和) ：只有都是1才是1
     * （和 s ）=（非进位和 n ）+（进位 c ）。即可将 s = a + b 转化为：
     * s=a+b⇒s=n+c
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;//c=进位
            a ^= b;//a=非进位和
            b = c;//b= 进位
        }
        return a;
    }
}
