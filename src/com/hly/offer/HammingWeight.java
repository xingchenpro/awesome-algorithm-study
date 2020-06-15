package com.hly.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : AC 面试题15. 二进制中1的个数
 * https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 */
public class HammingWeight {

    public int hammingWeight(int n) {
        int count =0;
        while (n!=0){
            n&=(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(new HammingWeight().hammingWeight(9));
    }
}
