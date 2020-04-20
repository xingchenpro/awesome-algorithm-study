package com.hly.algorithm.loadbalancer.impl;

import com.hly.algorithm.loadbalancer.LoadBalancer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/31
 * @QQ :1136513099
 * @desc :权重
 */
public class WeightLoadBalancer<T> implements LoadBalancer<T> {

    private List<T> list = new ArrayList<>();
    private AtomicLong atomicLong = new AtomicLong(0);
    private int index;

    @Override
    public T getResult(List<T> result) {
        return null;
    }
}
