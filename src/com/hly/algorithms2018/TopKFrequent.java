package com.hly.algorithms2018;

import java.util.*;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/13
 */
//todo 前K个高频元素
//O(nlogn)
//输入: nums = [1,1,1,2,2,3], k = 2
//输出: [1,2]
public class TopKFrequent {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }
        Queue<Integer> pq  = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return hashMap.get(o1)-hashMap.get(o2);
            }
        });

        for(Integer key:hashMap.keySet()){
            if(pq.size()<k){
                pq.offer(key);
            }else{
                if(hashMap.get(pq.peek())<hashMap.get(key)){
                    pq.poll();
                    pq.offer(key);
                }
            }
        }
        result.addAll(pq);
        return result;
    }

    public static void main(String[] args) {
        int []nums={1,1,1,2,2,3};
        int []nums2={6,0,1,4,9,7,-3,1,-4,-8,4,-7,-3,3,2,-3,9,5,-4,0};//6//[-3,-4,4,0,1,9]
        List<Integer> result = topKFrequent(nums2,6);
       for(int i:result)
            System.out.print(i+" ");
    }
}
