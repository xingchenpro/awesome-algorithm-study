package com.hly.leeCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/26
 */
//202.快乐数
public class IsHappy {

    public static boolean isHappy(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = n;
        while (sum != 1) {
            int m = sum;
            sum = 0;
            while (m != 0) {
                sum += Math.pow(m % 10, 2);
                m /= 10;
            }
            if(map.get(sum)==null)
                map.put(sum,1);
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(4));
    }
}
