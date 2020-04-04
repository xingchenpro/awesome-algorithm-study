package com.hly.loadbalancer;

import com.hly.loadbalancer.impl.IpHashLoadBalancer;
import com.hly.loadbalancer.impl.RotationLoadBanancer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/31
 * @QQ :1136513099
 * @desc :
 */
public class Test {

    public static void main(String[] args) {

        Map<String, String> ali1 = new HashMap<>();
        ali1.put("token1", "12312asdsadkladjkasd1");
        Map<String, String> ali2 = new HashMap<>();
        ali2.put("token2", "12312asdsadkladjkasd2");
        List<Map<String, String>> list = new ArrayList<>();
        list.add(ali1);
        list.add(ali2);
        LoadBalancer<Map<String, String>> listLoadBalancer = new RotationLoadBanancer<>();
        System.out.println(listLoadBalancer.getResult(list));
        System.out.println(listLoadBalancer.getResult(list));
        System.out.println(listLoadBalancer.getResult(list));
        System.out.println(listLoadBalancer.getResult(list));
        System.out.println(listLoadBalancer.getResult(list));
        //IP
        System.out.println("IP");
        IpHashLoadBalancer<Map<String, String>> ipHashLoadBalancer = new IpHashLoadBalancer<>();
        System.out.println(ipHashLoadBalancer.getResult(list, "1234142"));
        System.out.println(ipHashLoadBalancer.getResult(list, "1234141"));
        System.out.println(ipHashLoadBalancer.getResult(list, "1234141"));
        System.out.println(ipHashLoadBalancer.getResult(list, "1234142"));

    }
}
