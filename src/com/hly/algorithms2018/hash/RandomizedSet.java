package com.hly.algorithms2018.hash;

import java.util.HashMap;
import java.util.Random;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/25
 * @QQ :1136513099
 * @desc : 380. 常数时间插入、删除和获取随机元素
 */
public class RandomizedSet {

    private HashMap<Integer,Object> map;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        this.map = new HashMap<>(8);
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.keySet().contains(val)){
            return false;
        }else{
            map.put(val,new Object());
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(map.keySet().contains(val)){
            map.remove(val);
            return true;
        }else{
            return false;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        Integer[]keys = map.keySet().toArray(new Integer[]{});
        return keys[new Random().nextInt(keys.length)];
    }

}
