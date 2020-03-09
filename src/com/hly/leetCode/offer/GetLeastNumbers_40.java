package com.hly.leetCode.offer;

import java.util.PriorityQueue;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/10
 * @QQ :1136513099
 * @desc : 面试题40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 */
public class GetLeastNumbers_40 {

    //维护一个大顶推
    public static int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[]{};
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> o2 - o1));
        for (int i = 0; i < arr.length; i++) {
            if (queue.size() < k) {
                queue.offer(arr[i]);
            }
            //这里边界值为k,满了再判断,而且是 else ,否则会再次使用当前的i进行判断
            else if (queue.size() == k && queue.peek() > arr[i]) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }

        int[] res = new int[queue.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = queue.poll();
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 2, 0, 5};
        int[] nums2 = {0, 0, 1, 2, 4, 2, 2, 3, 1, 4};
        int[] nums3 = {0, 0, 1, 3, 4, 5, 0, 7, 6, 7};
        int[] res = getLeastNumbers(nums3, 9);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
