package com.hly.offer;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : AC 面试题06. 从尾到头打印链表
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class ReversePrint {

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    //解法1：先反转过来输出，再反转回去
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[]{};
        }
        int count = 0;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
            count++;
        }
        int[] res = new int[count];
        int i = 0;
        cur = pre;
        while (cur != null) {
            res[i++] = cur.val;
            cur = cur.next;
        }
        cur = pre;
        pre = null;
        while (cur!=null){
            ListNode tmp =  cur.next;
            cur.next  =pre;
            pre = cur;
            cur = tmp;
        }
        return res;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for(int i=0;i<5;i++){
            cur.next = new ListNode(i+1);
            cur = cur.next;
        }
        int []res = new ReversePrint().reversePrint(head.next);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");
        }
    }
}
