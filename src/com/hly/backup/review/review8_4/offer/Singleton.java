package com.hly.backup.review.review8_4.offer;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/29
 * @QQ :1136513099
 * @desc : 2、实现单例模式
 */
//兼顾饿汉模式单例模式的内存浪费问题和synchronized的性能问题
//屏蔽了这两个缺点
public class Singleton {

    public static final Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    public static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
