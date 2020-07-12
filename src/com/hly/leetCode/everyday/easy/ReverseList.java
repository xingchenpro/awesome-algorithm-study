package com.hly.leetCode.everyday.easy;

import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/12
 * @desc : 206. 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class ReverseList {

    private static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        //cur !=null,当前节点不为空
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
    //1,2,3,4,5
    //5,4,3,2,1
    //4,3,2,1
}
