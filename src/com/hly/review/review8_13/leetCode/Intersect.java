package com.hly.review.review8_13.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/13
 * @QQ :1136513099
 * @desc :
 */
public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
            return new int[]{};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i]))
                map.put(nums1[i], 1);
            else
                map.put(nums1[i], map.get(nums1[i]) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])&&map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int res[] =new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
