package com.stardust.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2021/4/12
 * @desc : 2、单例模式
 * 注意要点：
 * 1、多线程情况下，需要保证唯一
 * //兼顾饿汉模式单例模式的内存浪费问题和synchronized的性能问题,屏蔽了这两个缺点
 */
public class Singleton {

    //构造函数私有，禁止其他人创建实例
    private Singleton() {
    }

    //静态内部类，默认不会被加载
    private static final class LazyHander {
        private static final Singleton singleton = new Singleton();
    }

    ////static 使单例共享，final 保证方法不会被重写
    public static final Singleton getInstance() {
        return LazyHander.singleton;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}
