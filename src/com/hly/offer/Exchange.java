package com.hly.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : 面试题21. 调整数组顺序使奇数位于偶数前面
 * https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 */
public class Exchange {

    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            while (nums[i] % 2 == 1 && i < j) {
                i++;
            }
            //j%2
            while (nums[j] % 2 == 0 && i < j) {
                j--;
            }
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            //交换之后再向前移动
            i++;
            j--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Exchange exchange = new Exchange();
        int[] res = exchange.exchange(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
