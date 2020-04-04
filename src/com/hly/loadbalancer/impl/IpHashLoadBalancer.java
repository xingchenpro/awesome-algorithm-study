package com.hly.loadbalancer.impl;

import com.hly.loadbalancer.LoadBalancer;

import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
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
