package com.hly.offer.chapter2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/29
 * @QQ :1136513099
 * @desc : 2、实现单例模式
 */
//兼顾饿汉模式单例模式的内存浪费问题和synchronized的性能问题
//屏蔽了这两个缺点
public class Singleton  {

    //static 使单例共享，final 保证方法不会被重写，重载
    public static final Singleton getInstance(){
        //返回结果之前，先加载内部类
        return LazyHolder.INSTANCE;
    }

    //默认不会加载
    public static class LazyHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
}
