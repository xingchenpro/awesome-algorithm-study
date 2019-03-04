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
    public void deleteDuplecate(){
        Hashtable<Integer,Integer> table = new Hashtable<>();
        Node temp = head;
        Node preNode = null;
        while(temp!=null){
            if(table.containsKey(temp.data))
                preNode.next = temp.next;//链表前移一位，删掉此元素,最后一个直接赋值为空
            else{
                table.put(temp.data,1);
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
    public void deleteDuplecate2(){
        Node p = head;
        while (p!=null){
            Node q = p;
            while (q.next!=null){
                if(p.data == q.next.data){
                    q.next = q.next.next;//双层循环，若重复直接删除，最后一个直接置为空
                }else{
                    q = q.next;
                }
                p = p.next;
            }
        }
    }
    // 1 2 3 4 5 6 5
    //p 5
    //6







}


//定义存储的节点信息
class Node {
    Node next = null;
    int data;

    public Node(int data) {
        this.data = data;
    }
}