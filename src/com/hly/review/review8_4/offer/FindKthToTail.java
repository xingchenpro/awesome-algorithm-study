package com.hly.review.review8_4.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/31
 * @QQ :1136513099
 * @desc :22、链表中倒数k个节点
 */
public class FindKthToTail {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode findKthToTail(ListNode head, int k) {
        if(head==null)
            return null;
        ListNode p1 = head, p2 = head;
       while (p1!=null&&k-->0)
           p1 = p1.next;
       //不符合条件
       if(k>0)
           return null;
       while (p1!=null){
           p1 = p1.next;
           p2 = p2.next;
       }
       return p2;
    }
}
