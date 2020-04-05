package com.hly.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ListTest {
    public static void main(String[] args) {
        //就是数组实现
        List<Integer> integers = new ArrayList<>();

        //就是链表实现
        List<Integer> integers2 = new LinkedList<>();

        Vector<Integer> vector;        //也是数组 但是他是线程安全的	同时只有一个=线程可以操作，

        //他们的区别
        //数组读取灵活 随机访问快可以用下标
        //链表呢？
        //多线程的情况下用vector

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new Runnable() {
            @Override
            public void run() {

            }
        });

    }
}
