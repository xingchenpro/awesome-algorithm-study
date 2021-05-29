package com.stardust.offer;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/27
 * @desc :  40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
public class GetLeastNumbers {


    //优先队列：https://www.sohu.com/a/256022793_478315
    //大顶堆，堆顶元素最大，如果后进的数比堆顶元素小，就把堆顶元素弹出
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k <= 0) {
            return new int[]{};
        }

        //默认升序，改为降序
        //最大优先队列：当前最大的元素先出队1
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < arr.length; i++) {
            if (queue.size() < k) {
                queue.offer(arr[i]);
            } else if (queue.size() == k && queue.peek() > arr[i]) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        int[] res = new int[k];

        int i = 0;
        for (Integer value : queue) {
            res[i++] = value;
        }

        return res;

    }


    public static void main(String[] args) {
        int[] res = new GetLeastNumbers().getLeastNumbers(new int[]{3, 2, 1}, 2);
        for (int re : res) {
            System.out.print(re + " ");//1,2
        }
        //考虑 0


    }
}
