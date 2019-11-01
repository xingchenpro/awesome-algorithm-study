package com.hly.algorithm.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc : 堆排序
 */
public class HeapSort {

    //构建一个最大堆
    public static void build_max_heap(int array[], int length) {
        for (int i = array.length / 2; i > 0; i--) {
            max_heapify(array, i, length);
        }
    }
    //调整最大堆
    public static void max_heapify(int arrays[], int i, int length) {
        //
        int l = i * 2;//左节点，数组初始下标为 1，为 0 时为2*i+1
        int r = i * 2 + 1;
        int largest = -1;
        if (l < length && arrays[l] > arrays[i]) {
            largest = l;
        } else {
            largest = i;
        }
        if (r < length && arrays[r] > arrays[largest]) {
            largest = r;
        }
        if (largest != i) {
            //交换当前节点a[i]和最大的节点a[largest]
            arrays[i] = arrays[i] + arrays[largest];
            arrays[largest] = arrays[i] - arrays[largest];
            arrays[i] = arrays[i] - arrays[largest];
            max_heapify(arrays, largest, length);
        }
    }

    //堆排序
    //最大堆，每次调整，最大元素总在a[1]中，与a[n]互换，然后排除a[n]再调整
    //在剩余节点中，由于交换并排序了原来为最大节点的根，可能会违背最大堆的性质
    //为了维护最大堆，则调用max_heapify(array,1,i)在a[1..i]上构造一个最大堆
    //每一次取出最大元素，绕后调整最大堆
    public static void sort_heap(int array[]) {
        build_max_heap(array, array.length);
        int i = array.length - 1;
        while (i > 1) {
            array[1] = array[1] + array[i];
            array[i] = array[1] - array[i];
            array[1] = array[1] - array[i];
            i--;
            max_heapify(array, 1, i);
        }
    }

    public static void main(String[] args) {
        int nums[] = {0, 5, 3, 17, 10, 84, 19, 6, 22, 9, 35};
        sort_heap(nums);
        for (int i : nums)
            System.out.print(i + " ");
    }
}
