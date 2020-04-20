package com.hly.leetCode.offer.offer2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/12
 * @QQ :1136513099
 * @desc : 面试题35. 复杂链表的复制
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 */
public class CopyRandomList {

    private static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val, Node next, Node random) {
            this.val = val;
            this.next = next;
            this.random = random;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    //解法1:原地法
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        //将拷贝节点放到原节点后面，例如1->2->3这样的链表就变成了这样1->1'->2'->3->3'
        for (Node node = head, copy = null; node != null; node = node.next.next) {
            copy = new Node(node.val);
            copy.next = node.next;
            node.next = copy;
        }
        //复制拷贝节点的random指针
        for (Node node = head; node != null; node = node.next.next) {
            if (node.random != null) {
                node.next.random = node.random.next;
            }
        }
        //分离拷贝节点和原节点，变成1->2->3和1'->2'->3'两个链表，后者就是答案
        Node newHead = head.next;
        for (Node node = head, tmp = null; node != null && node.next != null; ) {
            tmp = node.next;
            node.next = tmp.next;
            node = tmp;
        }
        return newHead;
    }

    //解法2:hash法,存储[源节点，拷贝节点]


}
