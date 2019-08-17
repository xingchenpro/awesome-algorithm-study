package com.hly.offer.chapter3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/31
 * @QQ :1136513099
 * @desc :24、反转链表
 */
public class ReverseList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    //迭代
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextTemp;
        }
        return pre;
    }

}
