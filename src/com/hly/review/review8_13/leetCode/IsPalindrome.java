package com.hly.review.review8_13.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/13
 * @QQ :1136513099
 * @desc :
 */
public class IsPalindrome {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        ListNode p1 = head,p2 = head;
        while (p2!=null&&p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        ListNode cur = p1;
        ListNode pre = null;
        //反转后半部分
        while (cur!=null){
            ListNode tempNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tempNext;
        }
        //头部
        cur = head;
        //中间
        ListNode in = pre;
        boolean flag = true;
        while (in!=null){
            if(cur.val!=in.val){
                flag = false;
                break;
            }
            cur = cur.next;
            in = in.next;
        }
        //恢复原来结构
        cur = pre;
        pre = null;
        while (cur!=null){
            ListNode tempNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tempNext;
        }
        return flag;
    }
}
