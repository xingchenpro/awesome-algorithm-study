package com.hly.backup.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/19
 */
//35. 搜索插入位置
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        int index = -1,start = 0,end = nums.length;
        while (start<end){
            int mid = (start+end)/2;
            if(nums[mid]>target){
                end = mid;
                index = mid;
            }else if(nums[mid]<target){
                start = mid+1;
                index = mid+1;
            }else{
                return  mid;
            }
        }
        return index;
    }

    public static void main(String[] args){

        int nums[]={1,3,5,6};
        System.out.println(searchInsert(nums,5));




    }
}
