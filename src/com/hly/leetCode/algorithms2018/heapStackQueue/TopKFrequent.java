package com.hly.leetCode.algorithms2018.heapStackQueue;

import java.util.*;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/22
 * @QQ :1136513099
 * @desc : 347. 前 K 个高频元素
 */
public class TopKFrequent {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        /*Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });*/

        Queue<Integer> pq = new PriorityQueue<>((o1, o2) -> map.get(o1)-map.get(o2));

        for(Integer key:map.keySet()){
            if(pq.size()<k){
                pq.offer(key);
            }else{
                if(map.get(pq.peek())<map.get(key)){
                    pq.poll();
                    pq.offer(key);
                }
            }
        }
        result.addAll(pq);
        return result;
    }

    public static void main(String[] args){
        List<Integer> list =topKFrequent(new int[]{1,1,1,2,2,3},2);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }





    }
}
