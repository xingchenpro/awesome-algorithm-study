package com.hly.algorithms2018;
import java.util.HashMap;
/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/11
 */
//todo 两个数组的交集 II**
//输入: nums1 = [1,2,2,1], nums2 = [2,2]
//输出: [2,2]
//输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出: [4,9]
public class Intersect {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (!hashMap.containsKey(String.valueOf(nums1[i]))) {
                hashMap.put(String.valueOf(nums1[i]), 1);
                count++;
            }
            else{
                hashMap.put(String.valueOf(nums1[i]), hashMap.get(String.valueOf(nums1[i]))+1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hashMap.containsKey(String.valueOf(nums2[i]))) {
                hashMap2.put(String.valueOf(nums2[i]), hashMap.get(String.valueOf(nums2[i]))+1);
            }
        }

        int result[] = new int[count];
        int i = 0;
        for (String key : hashMap2.keySet()) {
            if (hashMap2.get(key) %2==0) {
                for(int j=0;j<hashMap2.get(key)/2;j++)
                result[i++] = Integer.parseInt(key);
            }
        }
        return result;
    }

    public static void main(String[] args){
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        int nums3[] = {1,2,2,1};
        int nums4[] = {2,2};
        int nums[]=intersect(nums3,nums4);
        for(int i:nums)
            System.out.print(i+" ");
    }
}
