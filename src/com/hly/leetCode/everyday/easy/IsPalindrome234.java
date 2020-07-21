package com.hly.leetCode.everyday.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/21
 * @desc : 234. 回文链表
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class IsPalindrome234 {

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    //解法1:放到数组中
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        int start = 0, end = list.size() - 1;
        while (start < end) {
            if (!list.get(start).equals(list.get(end)))
                return false;
            start++;
            end--;
        }
        return true;
    }

    //解法2：将后半部分倒过来
}
