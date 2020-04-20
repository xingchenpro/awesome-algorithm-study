package com.hly.leetCode.leetCode.medium;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/21
 * @QQ :1136513099
 * @desc : 215. 数组中的第K个最大元素
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class FindKthLargest {

    //解法1：快排思想
    public static int findKthLargest(int[] nums, int k) {
        return quickSort(nums,0,nums.length-1,k);

    }

    public static int quickSort(int[] nums,int low,int high,int k){
        int t = partition(nums,low,high);
        //是第k大
        int target = nums.length-k;
        if(t==target){
            return nums[target];
        }else if(t<target){
            return quickSort(nums,t+1,high,k);
        }else{
            return quickSort(nums,low,t-1,k);
        }
    }

    //快排思想
    public static int partition(int[] arr, int low, int high) {
        int i = low, j = high, t = arr[low];
        while (i < j) {
            while (i < j && arr[j] >= t) {
                j--;
            }
            while (i < j && arr[i] <= t) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        //与基准数交换
        arr[low] = arr[i];
        arr[i] = t;
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    //解法2：维护一个小顶堆
    public static int findKthLargest2(int[] nums, int k) {
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

    public static void main(String[] args) {
        int []arr={3,2,1,5,6,4};
        System.out.println(findKthLargest2(arr, 2));

    }
}
