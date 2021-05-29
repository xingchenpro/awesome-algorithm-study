package com.hly.backup.review.review8_13.leetCode;

import java.util.*;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/13
 * @QQ :1136513099
 * @desc :
 */
public class TopKFrequent {

     /*Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });*/

    public List<Integer> topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }
        Queue<Integer> queue = new PriorityQueue<>(((o1, o2) -> map.get(o1) - map.get(o2)));
        List<Integer> result = new ArrayList<>();
        for (Integer key:map.keySet()){
            if(queue.size()<k){
                queue.offer(key);
            }else{
                if(map.get(queue.peek())<map.get(key)){
                    queue.poll();
                    queue.offer(key);
                }
            }
        }
        result.addAll(queue);
        return result;
    }
}
