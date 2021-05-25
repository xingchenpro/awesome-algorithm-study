package com.stardust.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/24
 * @desc : 35. 复杂链表的复制
 */
public class CopyRandomList {

    private static class Node {

        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }


    public Node copyRandomList0(Node head) {
        if (head == null) {
            return null;
        }

        Node cur = head;
        Node ran = new Node(0), pre = ran;
        while (cur != null) {

            Node node = new Node(cur.val);
            pre.next = node;
            cur = cur.next;
            pre = node;

        }
        return ran.next;
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node cur = head;

        Map<Node, Node> map = new HashMap<>();
        while (cur != null) {

            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;

        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }


    public static void main(String[] args) {
        System.out.println("");
    }


}
