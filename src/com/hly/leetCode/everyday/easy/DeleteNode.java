package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/22
 * @desc : 237. 删除链表中的节点
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNode {

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public void deleteNode(ListNode node) {
        if (node.next != null) {
            //后一个节点直接赋值给前一个节点
            node.val = node.next.val;
            //当前节点指向下下个节点
            node.next = node.next.next;
        }
    }
}
