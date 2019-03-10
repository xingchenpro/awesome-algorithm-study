package com.hly.dataStructure.linkedList;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/9
 */
//不带头结点的单链表
public class LinkedListWithoutHead<AnyType extends Comparable<? super AnyType>> {

    //定义节点
    private static class Node<AnyType> {

        private Node<AnyType> next;
        private AnyType data;

        public Node() {
            this(null, null);
        }

        public Node(AnyType data) {
            this.data = data;
        }

        public Node(Node<AnyType> head, AnyType data) {
            this.next = head;
            this.data = data;
        }
    }

    private Node<AnyType> head;//头指针
    private int size;

    public LinkedListWithoutHead(Node<AnyType> head, int size) {
        this.head = head;
        this.size = size;
    }

    public LinkedListWithoutHead() {
        this(null, 0);
    }

    //返回单链表的大小
    public int size() {
        return size;
    }

    //返回单链表的长度
    public int length() {
        int j = 0;
        Node<AnyType> p = head;
        if (head == null)//头指针为空，则长度为 0
            return 0;
        while (p != null) {
            p = p.next;
            j++;
        }
        return j;
    }

    //返回单链表的位置
    public int indexOf(AnyType x) {
        int j = 0;
        Node<AnyType> p = head;
        while (p != null && !p.data.equals(x)) {
            p = p.next;
            j++;
        }
        if (p != null)
            return j;
        return -1;
    }

    //返回第 i 个节点
    public AnyType get(int i) throws Exception {
        Node<AnyType> p = head;
        int j = 0;
        while (j < i && p != null) {
            p = p.next;
            j++;
        }
        if (j > i || p == null)
            throw new Exception("查找位置不合法");
        return p.data;
    }

    //插入节点
    public void add(int i, AnyType x) throws Exception {
        Node<AnyType> p = head;
        int j = 0;
        while (j < i - 1 && p != null) {
            p = p.next;
            j++;
        }
        if (j > i && p == null)
            throw new Exception("插入位置不合法!");
        Node<AnyType> s = new Node<>(x);
        //插入的位置为表头时
        if (i == 0) {
            s.next = head;
            head = s;
            size++;
        } else {
            s.next = p.next;
            p.next = s;
            size++;
        }
    }

    //删除并返回节点
    public AnyType remove(int i) throws Exception {
        Node<AnyType> p = head;
        int j = 0;
        while (j < i - 1 && p != null) {
            p = p.next;
            j++;
        }
        if (j > i || p == null)
            throw new Exception("删除位置不合法");
        Node<AnyType> node;
        //如果删除的是首节点
        if (i == 0) {
            node = head;
            head = head.next;
        } else {
            node = p.next;
            p.next = p.next.next;
            size--;
        }
        p.next = p.next.next;
        size--;
        return node.data;
    }

    //输出所有节点
    public void display() {
        Node<AnyType> p = head;//从头指针指向的第一个节点开始
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    //单链表就地逆置
    public Node<AnyType> reverse() {
        Node<AnyType> p = head;
        head = null;
        while (p != null) {
            Node<AnyType> q = p.next;
            p.next = head;
            head = p;
            p = q;
        }///
        return head;
    }

    public static void main(String[] args) throws Exception {

        LinkedListWithoutHead<Integer> list = new LinkedListWithoutHead<>();
        //添加数据
        for (int i = 0; i < 3; i++)
            list.add(list.length(), i);
        list.display();

        //单链表的长度
        System.out.println("单链表的长度：" + list.length());
        //查找值为 x 的节点
        System.out.println("查找值为 x 的节点："+list.indexOf(2));
        //就地逆置
        list.reverse();
        list.display();
        //删除元素
        System.out.println("删除第i个元素：" + list.remove(0));
        list.display();
    }
}
