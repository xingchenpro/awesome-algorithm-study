package com.hly.algorithm.sort;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc : 堆排序
 */
public class HeapSort {

    //https://www.cnblogs.com/chengxiao/p/6129630.html
    public static void sort(int[] arr) {
        //构建大顶堆
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            //从第一个非叶子节点，从下到上，从右到左调整结构
            adjustHeap(arr, i, arr.length);
        }
        //调整之后，交换堆顶元素和末尾元素
        for (int j = arr.length - 1; j > 0; j--) {
            swap(arr, 0, j);
            //重新调整
            adjustHeap(arr, 0, j);
        }
    }
    /**
     * 调整大顶堆
     */
    public static void adjustHeap(int[] arr, int i, int length) {
        //取出当前节点 i
        int temp = arr[i];
        //从 i 的左子节点开始，也就是 2*i+1处开始
        for (int k = i * 2 + 1; k < length; k = i * 2 + 1) {
            //如果左子节点小于右子节点
            if (k + 1 < length && arr[k] < arr[k + 1]) {
                k++;
            }
            //如果子节点大于父节点，那将子节点赋值给父节点，不用替换
            if (arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        //将 temp 放到最终的位置
        arr[i] = temp;
    }

    /**
     * 交换堆顶元素
     */
    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void main(String[] args) {
        //int nums[] = {10, 84, 19, 6, 22, 9, 35,0, 5, 3, 17};
        int nums[] = {4,6,8,5,9};
        //int nums[] = {9,7,6,8,5,3,4,2,1};
        sort(nums);
        for (int i : nums)
            System.out.print(i + " ");
    }
}
