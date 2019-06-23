package com.hly.dataStructure.sort;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/22
 * @QQ :1136513099
 * @desc : 堆排序
 */
public class HeapSort {

    /**
     *   平均        最快       最慢
     *   O(nlgn)      O(nlgn)      O(nlgn)
     * @param array
     */

    //n 为当前需要排序的堆的大小
    public void max_heapify(int array[],int i,int length){
        int l = i*2;//初始下标为1 ，为0时为2*i+1
        int r = i*2+1;
        int largest=-1 ;
        if(l<length&&array[l]>array[i]){
            largest = l;
        }else{
            largest = i;
        }
        if(r<length&&array[r]>array[largest]){
            largest = r;
        }
        if(largest!=i){
            //exchange A[i] with A[largest]
            array[i] = array[i]+array[largest];
            array[largest] = array[i] - array[largest];
            array[i] = array[i] - array[largest];
            max_heapify(array,largest,length);
        }
    }

    //构建一个最大堆
    public void build_max_heap(int array[],int length){
        for(int i = array.length/2;i>0;i--)
            max_heapify(array,i,length);
    }

    //最大堆，最大元素总在根节点A[1]中，与A[n]互换，然后去掉节点n
    //剩余节点中，原来根的孩子仍然是最大堆，新根节点可能会违背最大堆的性质
    //为了维护最大堆，调用max_heapify(array,1,i);在A[1...n-1]上构造一个新的最大堆
    //每一次取出最大元素，然后调整最大堆
    public int[] sort_heap(int array[]){
        build_max_heap(array,array.length);
        int i = array.length-1;
        while (i>1){
            array[1] = array[1]+array[i];
            array[i] = array[1] - array[i];
            array[1] = array[1] - array[i];
            i--;
            max_heapify(array,1,i);
        }
        return array;
    }

    public static void main(String[] args){
       int nums[]={0,5,3,17,10,84,19,6,22,9,35};
       HeapSort heapSort = new HeapSort();
       int res[] = heapSort.sort_heap(nums);
       for(int i:res)
           System.out.print(i+" ");
    }
}
