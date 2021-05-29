package com.hly.algorithm.loadbalancer.impl;

import com.hly.algorithm.loadbalancer.LoadBalancer;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/31
 * @QQ :1136513099
 * @desc : 轮询算法
 */
public class RotationLoadBanancer<T> implements LoadBalancer<T> {

    private static AtomicLong atomicLong = new AtomicLong();

    @Override
    public T getResult(List<T> result) {
        /*Long index = atomicLong.incrementAndGet() % result.size();
        System.out.println(index);*/
        T res = result.get(Integer.parseInt(atomicLong.incrementAndGet() % result.size() + ""));
        return res;
    }
}
