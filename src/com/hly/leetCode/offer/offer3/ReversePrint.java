package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/20
 * @QQ :1136513099
 * @desc : AC 面试题06. 从尾到头打印链表
 */
public class ReversePrint {


    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public int[] reversePrint(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        int count = 0;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
            count++;
        }
        int[] arr = new int[count];
        int i = 0;
        cur = pre;
        while (cur != null) {
            arr[i++] = cur.val;
            cur = cur.next;
        }
        cur = pre;
        pre = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
            count++;
        }
        return arr;
    }
}
