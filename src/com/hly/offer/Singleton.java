package com.hly.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : 手写单例模式
 */
public class Singleton {

    private Singleton() {
    }

    private static final class Holder {
        private static final Singleton singleton = new Singleton();
    }

    //final 不会被重写
    public static final Singleton getInstance() {
        return Holder.singleton;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
        System.out.println(getInstance());
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
}
