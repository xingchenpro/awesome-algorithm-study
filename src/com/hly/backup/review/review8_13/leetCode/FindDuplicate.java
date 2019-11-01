package com.hly.backup.review.review8_13.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/13
 * @QQ :1136513099
 * @desc :
 */
public class FindDuplicate {

    public int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        do{
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }while (tortoise!=hare);

        int ptrl = nums[0];
        int ptr2 = tortoise;
        while (ptrl!=ptr2){
            ptrl = nums[ptrl];
            ptr2= nums[ptr2];
        }
        return ptrl;
    }


}
