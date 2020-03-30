package com.hly.leetCode.offer;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/30
 * @QQ :1136513099
 * @desc : TODO 面试题65. 不用加减乘除做加法
 */
public class Add_65 {

    public static int add(int a, int b) {
        AtomicInteger ai = new AtomicInteger(a);
        return ai.addAndGet(b);
    }

    public static void main(String[] args){
        System.out.println(add(5,6));
    }
}
