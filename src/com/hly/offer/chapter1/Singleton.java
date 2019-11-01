package com.hly.offer.chapter1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/11/2
 * @QQ :1136513099
 * @desc : 2、单例模式(静态内部类方式)
 */
//兼顾饿汉模式单例模式的内存浪费问题和synchronized的性能问题,屏蔽了这两个缺点
public class Singleton {

    //static 使单例共享，final 保证方法不会被重写
    public static final Singleton getInstance() {
        return Holder.INSTANCE;
    }
    //默认不会加载
    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static void main(String[] args){
        for (int i = 0; i <10 ; i++) {
            System.out.println(getInstance());
        }
    }
}
