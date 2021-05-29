package com.hly.leetCode.algorithms2018.list;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/22
 * @QQ :1136513099
 * @desc : todo 148. 排序链表
 */
public class SortList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public static ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode slow = head,fast = head.next;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = sortList(slow.next);
        slow.next = null;
        ListNode left = sortList(head);
        return merge(left,right);
    }


    //合并
    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1!=null||l2!=null){
            if(l1.val<l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur.next=(l1==null)?l2:l1;
        }
        return head.next;
    }





    public static void main(String[] args){
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int i = 1; i <= 5; i++) {
            p.next = new ListNode(i);
            p = p.next;
        }

        ListNode h = sortList(head);
        while (h!=null){
            System.out.println(h.val);
            h = h.next;
        }

    }
}
