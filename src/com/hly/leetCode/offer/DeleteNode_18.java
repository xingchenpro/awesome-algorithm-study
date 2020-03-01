package com.hly.leetCode.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/1
 * @QQ :1136513099
 * @desc : 面试题18. 删除链表的节点
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * 要点：如果删除的是头结点
 */
public class DeleteNode_18 {


    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //解法1：
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode cur = head;
        ListNode pre = null;
        //是头结点
        if (cur.val == val) {
            return head.next;
        }
        while (cur.val!=val){
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;
        return head;
    }

    //411
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        ListNode res = deleteNode(head, 9);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }

        //[-3,5,-99]

    }

}
