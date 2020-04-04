package com.hly.loadbalancer.weight;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/31
 * @QQ :1136513099
 * @desc : 权重实体类
 */
public class WeightEntity<T> {
    private T result;
    private int weight;

    public WeightEntity(T result, int weight) {
        this.result = result;
        this.weight = weight;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
