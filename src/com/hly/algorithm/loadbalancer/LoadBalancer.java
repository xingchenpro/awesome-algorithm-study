package com.hly.algorithm.loadbalancer;

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
public interface LoadBalancer<T> {

    /**
     * 轮训、权重、随机、一致性hash
     *
     * @param result
     * @return
     */
    T getResult(List<T> result);
}
