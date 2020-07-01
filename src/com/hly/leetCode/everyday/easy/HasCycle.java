package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/1
 * @desc : 141. 环形链表/
 * https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class HasCycle {

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(ListNode next) {
            this.next = next;
        }
    }

    public boolean hasCycle(ListNode head) {
        //为空或者只有一个节点
        if (head == null || head.next == null)
            return false;
        ListNode p1 = head;
        ListNode p2 = head.next;
        //当p1=p2,快的节点追上慢的节点，表示有环，退出循环
        while (p1 != p2) {
            //循环终止条件
            if (p1 == null || p2 == null) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return true;
    }

}
