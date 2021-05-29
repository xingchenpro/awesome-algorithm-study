package com.hly.backup.review.review8_5;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/1
 * @QQ :1136513099
 * @desc :40、最小的 k 个数
 */
public class LeastNumers {

    public void leastNumers(int[] array, int k) {
        if (array == null || array.length == 0) {
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (queue.size() < k) {
                queue.offer(array[i]);
            } else {
                if (queue.peek() > array[i]) {
                    queue.poll();
                    queue.offer(array[i]);
                }
            }
        }

        for (Integer integer : queue) {
            System.out.print(integer + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 5, 6, 7, 8, 6};
        int array2[] = { 6, 7, 8, 6,1, 2, 3, 5};
        new LeastNumers().leastNumers(array, 3);
        new LeastNumers().leastNumers(array2, 4);
    }
}
