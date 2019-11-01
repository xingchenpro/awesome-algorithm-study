package com.hly.backup.review.review8_13.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/13
 * @QQ :1136513099
 * @desc :
 */
public class HasCycle {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)
            return false;
        ListNode p1 = head,p2 = head.next;
        while (p1!=p2){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p2==null||p2.next==null)
                return false;
        }
        return true;
    }
}
