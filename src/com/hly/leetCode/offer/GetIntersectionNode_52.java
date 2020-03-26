package com.hly.leetCode.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/24
 * @QQ :1136513099
 * @desc : 面试题52. 两个链表的第一个公共节点
 */
public class GetIntersectionNode_52 {

    public static class ListNode{
        int val ;
        ListNode next;
        public ListNode(int x){
            this.val = x;
        }
    }
//
//    我们使用两个指针 node1，node2 分别指向两个链表 headA，headB 的头结点，然后同时分别逐结点遍历，当 node1 到达链表 headA 的末尾时，重新定位到链表 headB 的头结点；
//    当 node2 到达链表 headB 的末尾时，重新定位到链表 headA 的头结点。
//    这样，当它们相遇时，所指向的结点就是第一个公共结点。

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode n1 = headA,n2 = headB;
        while (n1!=n2){
            n1=n1==null?headB:n1.next;
            n2=n2==null?headA:n2.next;
        }
        return n1;
    }
}
