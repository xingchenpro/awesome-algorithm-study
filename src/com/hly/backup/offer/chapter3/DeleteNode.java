package com.hly.backup.offer.chapter3;

import java.util.List;

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
        if(head==null||head.next==null||delete==null)
            return null;
        //删除的节点不是1尾节点
        if(delete.next!=null){
            ListNode next = delete.next;
            delete.val = next.val;
            delete.next = next.next;
        }else{
            ListNode cur = head;
            while (cur.next!=delete)
                cur = cur.next;
            //因为是最后一个，这里直接等于空就好了
            cur.next = null;
        }
        return head;
    }

    //删除链表的重复节点





}
