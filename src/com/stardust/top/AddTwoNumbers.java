package com.stardust.top;

/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/6/9
 * @desc : 2. 两数相加
 * 两个链表代表连个数字，按逆序存储，相加，返回一个链表表示他们的和
 */
public class AddTwoNumbers {

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null, cur = null;
        int carry = 0;//进位
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = cur = new ListNode(sum % 10);
            } else {
                cur.next = new ListNode(sum % 10);
                cur = cur.next;
            }
            carry = (n1 + n2 + carry) / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry != 0) {
            cur.next = new ListNode(carry);
        }
        return head;
    }


    public static void main(String[] args) {


    }

}
