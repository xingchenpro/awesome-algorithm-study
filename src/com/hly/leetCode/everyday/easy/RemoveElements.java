package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
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
        if (head == null)
            return null;
        ListNode cur = head;
        while (cur.next!= null) {
            if (cur.val == val) {
              cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        int[] p = {1, 2, 6, 3, 4, 5, 6};
        for (int i = 0; i < p.length; i++) {
            head.val = p[i];
            head.next = new ListNode(p[i]);
        }

        RemoveElements re = new RemoveElements();
        ListNode res = re.removeElements(head, 6);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }

    }
}
