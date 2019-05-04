package com.hly.algorithms2018;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/4
 */
//合并两个有序数组
public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i];
                i++;
            } else {
                nums[k++] = nums2[j];
                j++;
            }
        }
        while (i < m) {
            nums[k++] = nums1[i];
            i++;
        }
        while (j < n) {
            nums[k++] = nums2[j];
            j++;
        }
        int l = 0;
        for (int a : nums) {
            nums1[l++] = a;
            System.out.print(a + " ");
        }
    }


    public static void main(String[] args) {
        int num1[] = {1, 2, 3, 0, 0, 0};
        int num2[] = {2, 5, 6};
        merge(num1, 3, num2, 3);
    }
}
