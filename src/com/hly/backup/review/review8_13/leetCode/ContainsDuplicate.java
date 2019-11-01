package com.hly.backup.review.review8_13.leetCode;

import java.util.HashMap;
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
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length==0)
            return false;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],nums[i]);
            }else{
                return true;
            }
        }
        return false;
    }
}
