package com.hly.algorithm.loadbalancer.impl;

import com.hly.algorithm.loadbalancer.LoadBalancer;

import java.util.List;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/31
 * @QQ :1136513099
 * @desc :
 */
public class IpHashLoadBalancer<T> implements LoadBalancer<T> {
    @Override
    public T getResult(List<T> result) {
        return null;
    }

    public T getResult(List<T> result, String ip) {
        int index = ip.hashCode() % result.size();
        T res = result.get(index);
        return res;
    }
}
