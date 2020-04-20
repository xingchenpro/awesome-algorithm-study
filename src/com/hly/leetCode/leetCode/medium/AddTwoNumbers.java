package com.hly.leetCode.leetCode.medium;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/21
 * @QQ :1136513099
 * @desc : 2. 两数相加
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    private static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    //解法1：维护进位变量 t
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(0);
        ListNode pre = res;
        int t = 0;//进位变量
        while (l1 != null || l2 != null || t != 0) {
            if(l1!=null){
                t+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                t+=l2.val;
                l2 = l2.next;
            }
            pre.next = new ListNode(t%10);
            pre = pre.next;
            t/=10;
        }
        return res.next;
    }
}
