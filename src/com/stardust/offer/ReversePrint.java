package com.stardust.offer;

import java.util.Stack;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/4/19
 * @desc : TODO 06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class ReversePrint {

    private static class ListNode {
        private int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    //利用栈先进后出的特性，把链表依次放入栈中
    //然后在出栈，放到一个数组中，打印链表
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] nodes = new int[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = stack.pop().val;
        }
        return nodes;
    }

}
