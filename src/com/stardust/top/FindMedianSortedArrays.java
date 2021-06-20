package com.stardust.top;

/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/6/20
 * @desc : 4. 寻找两个正序数组的中位数
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 */
public class FindMedianSortedArrays {


    //解法一：归并
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length + nums2.length;
        int [] res = new int[n];
        int i = 0,j=0,k = 0;
        while (i!=nums1.length&&j!=nums2.length){
            if(nums1[i]<nums2[j]){
                res[k++] = nums1[i++];
            }else{
                res[k++] = nums2[j++];

            }
        }
        while (i!=nums1.length){
            res[k++] = nums1[i++];
        }

        while (j!=nums2.length){
            res[k++] = nums2[j++];
        }
        if(n%2==0){
            return (double)(res[n/2-1]+res[n/2])/2;
        }
        return (double)res[n/2];
    }
    //解法二：二分

    public static void main(String[] args){
        System.out.println(new FindMedianSortedArrays().findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        System.out.println(new FindMedianSortedArrays().findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));


    }

}
