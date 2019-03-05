package com.hly.dataStructure.linkedList;

import java.util.Hashtable;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/4
 */
public class MyLinkedList {

    //链表的表头
    Node head = null;

    //插入数据
    public void addNode(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = newNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //删除第 index 个节点
    public boolean deleteNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 2;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return true;
    }

    //返回节点的长度
    public int length() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    //对链表进行排序返回头结点
    public Node orderList() {
        Node nextNode = null;
        int temp = 0;
        Node curNode = head;
        while (curNode != null) {
            nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.data > curNode.next.data) {
                    temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }

    //删除重复元素，空间换时间
    public void deleteDuplecate() {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        Node temp = head;
        Node preNode = null;
        while (temp != null) {
            if (table.containsKey(temp.data))
                preNode.next = temp.next;//链表前移一位，删掉此元素,最后一个直接赋值为空
            else {
                table.put(temp.data, 1);
                preNode = temp;
            }
            temp = temp.next;
        }
    }
    // 1 2 3 4 5 6 5
    // temp 5
    // pre 6
    //ta 1 2 3 4 5 6

    //删除重复元素，时间换空间
    public void deleteDuplecate2() {
        Node p = head;
        while (p != null) {
            Node q = p;
            while (q.next != null) {
                if (p.data == q.next.data) {
                    q.next = q.next.next;//双层循环，若重复直接删除，最后一个直接置为空
                } else {
                    q = q.next;
                }
                p = p.next;
            }
        }
    }
    // 1 2 3 4 5 6 5
    //p 5
    //6

    //查找倒数第k个元素
    public Node findLastButAnyOneElement(Node head, int k) {
        if (k < 1)
            return null;
        Node p1 = head;
        Node p2 = head;
        //p1 先前移k-1步，之后两个指针同时移动，p1为null时，另一个指针的位置就是所要找的位置
        for (int i = 0; i < k - 1 && p1 != null; i++) {
            p1 = p1.next;
        }
        if (p1 == null) {
            System.out.println("k 值不合法");
            return null;
        }
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
    //1 2 4 5 5

    //实现链表的反转
    public void ReverseIteratively(Node head) {
        Node reHead = head;
        Node p = head;
        Node preNode = null;
        while (p != null) {//最后一步空的nextNode赋值给p结束
            Node nextNode = p.next;
            if (nextNode == null) {
                reHead = p;//最后一个元素赋值为头，只执行一次
                //否则
                p.next = preNode;//刚开始第一步preNode为null，p为第一个元素，第一个元素指向null，主要指针转移步骤
                preNode = p;
                p = nextNode;
            }
            this.head = reHead;
        }
    }
    // 1 2 3 4
    //preNode 2
    //nextNode null
    //p null
    //p.next 2
    //head = 3

    //从尾到头输出单链表(递归)
    public void printReList(Node listHead) {
        if (listHead != null) {
            printReList(listHead.next);
            System.out.println(listHead.data);
        }
    }

    //寻找单链表的中间节点
    public Node findMidNode(Node head) {
        Node p = this.head;
        Node q = this.head;
        while (p != null && p.next != null && p.next.next != null) {
            p = p.next.next;
            q = q.next;
        }
        return q;
    }

    //不知道头指针情况下删除指定节点
    public boolean deleteNode(Node p) {
        if (p == null || p.next == null)
            return false;
        int temp = p.data;
        p.data = p.next.data;
        p.next.data = temp;
        p.next = p.next.next;
        return true;
    }
}

//定义存储的节点信息
class Node {
    Node next = null;
    int data;

    public Node(int data) {
        this.data = data;
    }
}