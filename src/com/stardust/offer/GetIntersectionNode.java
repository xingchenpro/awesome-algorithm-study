package com.stardust.offer;

/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/6/1
 * @desc : 52. 两个链表的第一个公共节点
 * 输入两个链表，找出它们的第一个公共节点。
 */
public class GetIntersectionNode {


    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null)
            return null;
        ListNode listA = headA, listB = headB;
        while (listA != listB) {
            //if else 每次只能走一步
            if (listA == null) {
                listA = headB;
            } else {
                listA = listA.next;
            }
            if (listB == null) {
                listB = headA;
            } else {
                listB = listB.next;
            }

        }
        return listA;

    }


}
