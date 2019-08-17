package com.hly.review.review8_4.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/31
 * @QQ :1136513099
 * @desc :18、删除链表的节点
 */
public class DeleteNode {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    //O(1) 删除链表的节点
    public ListNode delete(ListNode head,ListNode delete){

        if(head==null||head.next==null)
            return null;

        if(delete.next!=null){
            ListNode next  = delete.next;
            delete.val = next.val;
            delete.next = delete.next.next;
        }else{
            ListNode cur = head;
            while (cur.next!=delete)
                cur = cur.next;
            cur.next = cur.next.next;
        }
        return head.next;
    }

    //删除链表的重复节点





}
