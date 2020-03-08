package com.hly.leetCode.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/8
 * @QQ :1136513099
 * @desc : 面试题39. 数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 */
public class MajorityElement_39 {

    public static int majorityElement(int[] nums) {
        int tmp = nums[0];
        int count =1;
        for(int i=1;i<nums.length;i++){
            if(tmp!=nums[i]) {
                count--;
            }else{
                count++;
            }
            if(count==0){
                tmp = nums[i];
                count=1;
            }
        }
        return tmp;
    }

    public static void main(String[] args){
       int []nums={1,2,3,2,2,2,5,4,2};
        System.out.println(majorityElement(nums));
    }
}
