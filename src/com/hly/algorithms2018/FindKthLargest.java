package com.hly.algorithms2018;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/13
 */
//todo 数组中的第K个最大元素
//在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
//不能排序
//输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
//输出: 4
public class FindKthLargest {

    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            if (pq.size() < k) {
                pq.offer(nums[i]);
            } else {
                if (nums[i] > pq.peek()) {
                    pq.poll();
                    pq.offer(nums[i]);
                }
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println(findKthLargest(nums, 4));
    }
}
//PriorityQueue 每次出队的元素是队列中最小的
//https://www.cnblogs.com/tstd/p/5125949.html
//被transient关键字修饰的变量不再能被序列化，一个静态变量不管是否被transient修饰，均不能被序列化。
//https://blog.csdn.net/weixin_32798865/article/details/78162207