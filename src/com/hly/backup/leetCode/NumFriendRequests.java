package com.hly.backup.leetCode;

import java.util.*;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/28
 * @QQ :1136513099
 * @desc :
 */
//AC 825. 适龄的朋友
//人们会互相发送好友请求，现在给定一个包含有他们年龄的数组，ages[i] 表示第 i 个人的年龄。
//当满足以下条件时，A 不能给 B（A、B不为同一人）发送好友请求：
//age[B] <= 0.5 * age[A] + 7
//age[B] > age[A]
//age[B] > 100 && age[A] < 100
//否则，A 可以给 B 发送好友请求。
//注意如果 A 向 B 发出了请求，不等于 B 也一定会向 A 发出请求。而且，人们不会给自己发送好友请求。
//求总共会发出多少份好友请求?
public class NumFriendRequests {

    public static int numFriendRequests(int[] ages) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < ages.length; i++) {
            if (map.get(ages[i]) == null) {
                map.put(ages[i], 1);
                list.add(ages[i]);
            } else {
                map.put(ages[i], map.get(ages[i]) + 1);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 15) {
                count += map.get(list.get(i)) * (map.get(list.get(i)) - 1);
            }
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (judge(list.get(i), list.get(j))) {
                    count += map.get(list.get(j)) * map.get(list.get(i));
                }
            }

        }
        return count;
    }

    public static boolean judge(int a, int b) {
        boolean result = true;
        if (a < b) {
            result = false;
        } else if (0.5 * a + 7 >= b) {
            result = false;
        } else if (b > 100 && a < 100) {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(numFriendRequests(new int []{16,16}));//2
        //System.out.println(numFriendRequests(new int []{16,17,18}));//2
        //System.out.println(numFriendRequests(new int []{8,85,24,85,69}));//4
        //System.out.println(numFriendRequests(new int []{73,106,39,6,26,15,30,100,71,35,46,112,6,60,110}));//29
        System.out.println(numFriendRequests(new int[]{56, 117, 42, 55, 100, 27, 97, 113, 56, 57, 117, 13, 42, 119, 67}));//48
    }
}

//双层for循环超时
//统计每个年龄人数，这样就把数据规模从2W缩小到120
//判断年龄相同，1.年龄相同的相互申请
//0.5 * a + 7>=b 相同年龄的年龄不能小于15，15岁以下没朋友
//多个年龄相同的和多个年龄相同的相互申请