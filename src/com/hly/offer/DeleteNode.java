package com.hly.offer;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : AC 面试题18. 删除链表的节点
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */
public class DeleteNode {
    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        //头结点特殊处理
        if (head.val == val)
            return head.next;
        //初始化当前节点的当前的前驱节点1
        ListNode pre = head;
        ListNode cur = head;
        while (cur != null) {
            //如果当前节点的值为所找节点
            if (cur.val == val) {
                //前驱节点直接指向当前节点的下一个节点
                pre.next = cur.next;
            }
            //否则当前节点赋值给前驱节点
            pre = cur;
            //继续向后遍历
            cur = cur.next;
        }
        return head;
    }

}
