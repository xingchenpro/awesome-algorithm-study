package com.hly.backup.offer.chapter5;

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
        if (array == null || array.length == 0)
            return;
        //默认为小顶堆
        Queue<Integer> queue = new PriorityQueue<>((((o1, o2) -> o2-o1)));
        for (int i = 0; i < array.length; i++) {
                queue.offer(array[i]);
                if (queue.size() > k) {
                    queue.poll();
                }
        }
        for (Integer integer : queue) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    //todo
    public void leastNumers2(int[] array, int k) {
        if (array == null || array.length == 0||k>array.length||k<0)
            return;
        int begin = 0,end = array.length-1;
        int index = partition(array,begin,end);
        while (index!=(k-1)){
            if(index>k-1){
                end = index-1;
                index = partition(array,begin,end);
            }else{
                begin = index+1;
                index = partition(array,begin,end);
            }
        }
        for(int i=0;i<k;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    public int partition(int array[], int begin, int end) {
        //枢轴
        int pivot = array[begin];
        while (begin < end) {

            while (begin < end && array[end] >= pivot)
                end--;
            while (begin < end && array[begin] > pivot)
                begin++;
            //从前面找到大于枢轴的值，和后面的数交换
            array[begin] = array[end];

        }

        array[end] =pivot;
        //begin 下标为大于pivot 的数
        return begin;
    }


    public static void main(String[] args) {

        int array[] = {1, 2, 3, 5, 6, 7, 8, 6};
        int array2[] = {16, 62, 63, 25, 36, 77, 5, 46};
        new LeastNumers().leastNumers2(array, 3);
        new LeastNumers().leastNumers2(array2, 4);
    }
}
