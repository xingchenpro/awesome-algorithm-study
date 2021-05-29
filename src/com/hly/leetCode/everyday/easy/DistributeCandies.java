package com.hly.leetCode.everyday.easy;

import java.util.Arrays;
import java.util.Set;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/10/13
 * @desc : 575. 分糖果
 * https://leetcode-cn.com/problems/distribute-candies/
 */
public class DistributeCandies {

    public int distributeCandies(int[] candies) {

        Arrays.sort(candies);
        int res = 1;
        for (int i=1;i<candies.length;i++){
            if(candies[i]!=candies[i-1]){
                res++;
            }
        }
        return Math.min(res,candies.length/2);

    }
    public static void main(String[] args){
        System.out.println(new DistributeCandies().distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
    }

}
