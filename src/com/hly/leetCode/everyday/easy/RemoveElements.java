package com.hly.leetCode.everyday.easy;

import java.util.List;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/10
 * @desc : 203. 移除链表元素
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 */
public class RemoveElements {

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        //哨兵节点，伪头
        ListNode sentinel = new ListNode(0);
        //考虑删除的节点是第一个节点，直接哨兵节点指向第一个节点的下一个节点
        sentinel.next = head;
        ListNode pre = sentinel, cur = head;
        while (cur != null) {
            if (cur.val == val)
                pre.next = cur.next;
            else
                pre = cur;
            cur = cur.next;
        }
        return sentinel.next;
    }

}
