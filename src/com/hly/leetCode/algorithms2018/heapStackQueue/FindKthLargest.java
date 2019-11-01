package com.hly.leetCode.algorithms2018.heapStackQueue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/21
 * @QQ :1136513099
 * @desc : 215.数组中的第K个最大元素
 */
public class FindKthLargest {

    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(queue.size()<k){
                queue.offer(nums[i]);
            }else{
                if(queue.peek()<nums[i]){
                    queue.poll();
                    queue.offer(nums[i]);
                }
            }
        }
        return queue.peek();
    }

    public static void main(String[] args){
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
    }
}
