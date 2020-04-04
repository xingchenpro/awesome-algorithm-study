package com.hly.leetCode.offer2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/4
 * @QQ :1136513099
 * @desc : 面试题06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class ReversePrint {

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    //解法1：先把链表返回过来，再反转过去
    public int[] reversePrint(ListNode head) {
        int count = 0;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = pre;
            pre = cur;//最后一步，pre即为第一个节点
            cur = nextTemp;//为空表示最后一个，跳出
            count++;
        }
        int nums[] = new int[count];
        cur = pre;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = cur.val;
            cur = cur.next;
        }
        cur = pre;
        pre = null;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextTemp;
        }
        return nums;
    }

    //解法2：直接输出到数组中，再反转数组

}
