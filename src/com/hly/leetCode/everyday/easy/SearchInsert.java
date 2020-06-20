package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/20
 * @QQ :1136513099
 * @desc : 35. 搜索插入位置/
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class SearchInsert {

    //解法1：二分法
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        //返回被插入的位置,nums[mid] < target 时，left = mid +1 ,low > high 时，跳出循环，low 为插入的点
        return low;
    }

    public static void main(String[] args) {
        System.out.println(new SearchInsert().searchInsert(new int[]{1, 3, 5, 6}, 5));//2
        System.out.println(new SearchInsert().searchInsert(new int[]{1, 3, 5, 6}, 2));//1
    }
}
