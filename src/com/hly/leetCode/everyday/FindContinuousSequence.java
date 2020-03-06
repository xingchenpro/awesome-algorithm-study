package com.hly.leetCode.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/6
 * @QQ :1136513099
 * @desc : 面试题57 - II. 和为s的连续正数序列
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 * 输入：target = 9
 * 输出：[[2,3,4],[4,5]]
 */
public class FindContinuousSequence {

    //TODO 解法1：滑动窗口
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        for (int l = 1, r = 1, sum = 0; r < target; r++) {
            sum += r;
            while (sum>target){
                sum-=l++;
            }
            if(sum==target){
                int [] t=new int[r-l+1];
                for (int i=0;i<t.length;i++){
                    t[i] = l+i;
                }
                list.add(t);
            }
        }
        int [][]res = new int[list.size()][];
        for(int i=0;i<res.length;i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("");
    }
}
