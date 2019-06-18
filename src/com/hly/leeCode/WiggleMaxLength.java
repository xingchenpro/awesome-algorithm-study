package com.hly.leeCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/18
 * @QQ :1136513099
 * @desc : todo 376. 摆动序列
 */
/**
 * 如果连续数字之间的差严格地在正数和负数之间交替，则数字序列称为摆动序列。
 * 第一个差（如果存在的话）可能是正数或负数。少于两个元素的序列也是摆动序列。
 * 例如，[1,7,4,9,2,5] 是一个摆动序列，因为差值 (6,-3,5,-7,3) 是正负交替出现的。相反, [1,4,7,2,5] 和 [1,7,4,5,5] 不是摆动序列，
 * 第一个序列是因为它的前两个差值都是正数，第二个序列是因为它的最后一个差值为零。
 * 给定一个整数序列，返回作为摆动序列的最长子序列的长度。
 * 通过从原始序列中删除一些（也可以不删除）元素来获得子序列，剩下的元素保持其原始顺序。
  */
/**
 * 输入: [1,7,4,9,2,5]
 *输出: 6
 *解释: 整个序列均为摆动序列。
 */
/**
 * 输入: [1,17,5,10,13,15,10,5,16,8]
 *输出: 7
 *解释: 这个序列包含几个长度为 7 摆动序列，其中一个可为[1,17,10,13,10,16,8]。
 */
public class WiggleMaxLength {

    //思路1，构建状态机
    //初始状态为 2 ,当一个数据比前一个数大时，转化为up,当一个数比前一个数小时，转化为down,当一个状态发生反转时，最大序列加1。
    // 其他情况表示连续增加或者连减小，是可删除的子序列，此时，摆动子序列的长度不变
    public static int wiggleMaxLength(int[] nums) {
        int len =1;
        int state = 2;//0 down ,1 up
        if(nums.length<2)
            return nums.length;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i-1]<nums[i]&&state==2){
                    state = 1;
                    len++;
            }
            else if(nums[i-1]>nums[i]&&state==2){
                state = 0;
                len++;
            }
            else if(nums[i-1]<nums[i]){
                if(state==0) {
                    state = 1;
                    len++;
                }
            }else if(nums[i-1]>nums[i]){
                if(state==1) {
                    state = 0;
                    len++;
                }
            }
        }
        return len;
    }

    public static void main(String[] args){
        System.out.println(wiggleMaxLength(new int[]{1,7,4,9,2,5}));//6
        System.out.println(wiggleMaxLength(new int[]{1,17,5,10,13,15,10,5,16,8}));//1,17,10,13,10,16,8
        System.out.println(wiggleMaxLength(new int[]{0,0}));//1
        System.out.println(wiggleMaxLength(new int[]{0,1}));//2
        System.out.println(wiggleMaxLength(new int[]{3,3,3,2,5}));//3
    }
}
