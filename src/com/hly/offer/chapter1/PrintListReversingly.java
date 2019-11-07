package com.hly.offer.chapter1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/11/6
 * @QQ :1136513099
 * @desc :6、从尾到头打印链表
 */

/**
 * 描述：输入一个链表的头结点，从尾到头反过来打印出每个节点的值
 */
public class PrintListReversingly {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    //递归
    public static void printListReversingly(ListNode head) {

        if (head != null) {
            if (head.next != null) {
                printListReversingly(head.next);
                System.out.println(head.next.val);
            }
        }
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int i = 1; i <= 5; i++) {
            p.next = new ListNode(i);
            p = p.next;
        }
        printListReversingly(head);
    }
}
