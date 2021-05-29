package com.hly.backup.offer.chapter2;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc :6、从尾到头打印链表
 */
public class PrintListReversingly {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static  void a(){

    }

    //解法1 递归
    public void printListReversingly(ListNode head) {


        if (head.next != null) {
            printListReversingly(head.next);
            System.out.print(head.next.val + " ");
        }
    }

    //解法2 栈

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int i = 1; i <= 5; i++) {
            p.next = new ListNode(i);
            p = p.next;
        }
        new PrintListReversingly().printListReversingly(head);

        /*while (head.next!=null){
            head=head.next;
            System.out.print(head.val+" ");
        }*/
    }
}
