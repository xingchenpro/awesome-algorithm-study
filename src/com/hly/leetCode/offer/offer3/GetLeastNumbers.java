package com.hly.leetCode.offer.offer3;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/22
 * @QQ :1136513099
 * @desc : 面试题40. 最小的k个数
 */
public class GetLeastNumbers {

    //解法1：大顶堆
    public int[] getLeastNumbers(int[] arr, int k) {
        //需要判断为 0 的情况
        if (k == 0)
            return new int[]{};
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < arr.length; i++) {
            if (queue.size() < k) {
                queue.offer(arr[i]);
            } else if (queue.size() == k) {
                if (queue.peek() > arr[i]) {
                    queue.poll();
                    queue.offer(arr[i]);
                }
            }
        }
        int[] res = new int[k];
        int i = 0;
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            res[i++] = iterator.next();
        }
        return res;
    }
}
