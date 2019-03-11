package com.hly.dataStructure.linkedList;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/11
 */

//带头结点的双向循环链表
public class LinkedListOfDuplex<AnyType extends Comparable<? super AnyType>> {

    private static class Node<AnyType> {
        AnyType data;
        private Node<AnyType> prior;
        private Node<AnyType> next;

        public Node() {
            this(null);
        }

        public Node(AnyType data) {
            this(data, null, null);
        }

        public Node(AnyType data, Node<AnyType> prior, Node<AnyType> next) {
            this.data = data;
            this.prior = prior;
            this.next = next;
        }
    }

    private Node<AnyType> head;//初始化头结点
    int size;

    public LinkedListOfDuplex() {
        head = new Node<>();//初始化头结点
        head.prior = head;
        head.next = head;
        size = 0;

    }

    //获取长度
    public int length() {
        Node<AnyType> p = head.next;
        int j = 0;
        while (p != head) {
            p = p.next;
            j++;
        }
        return j;
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public void clear() {
        head.next = null;
    }

    //获取第i个节点的数据
    public AnyType get(int i) {
        Node<AnyType> p;
        int j;
        if (i < size / 2) {
            p = head.next;
            j = 0;
            while (j < i) {
                p = p.next;
                j++;
            }
        } else {
            p = head;
            j = size;
            while (j > i) {
                p = p.prior;
                j--;
            }
        }
        return p.data;
    }

    //就地逆置
    public void reverse() {
        Node<AnyType> p, q, k;
        p = head.next;
        q = p.next;
        while (p != head) {
            k = q.next;
            q.next = p;
            p.prior = q;
            p = q;
            q = k;
        }
        q.next = p;
        p.prior = q;
    }

    //添加数据
    public void add(int i, AnyType x) throws Exception {
        Node<AnyType> p = head.next;//指向首节点
        int j = 0;
        while (p != head && j < i) {
            p = p.next;
            j++;
        }
        if (j != i && p != head)
            throw new Exception("插入位置不合法");
        Node<AnyType> s = new Node<>(x);
        p.prior.next = s;
        s.prior = p.prior;
        s.next = p;
        p.prior = s;
        size++;
    }


    //删除数据
    public AnyType remove(int i) throws Exception {
        Node<AnyType> p = head.next;
        int j = 0;
        while (p != head && j < i) {
            p = p.next;
            j++;
        }
        if (j != i)
            throw new Exception("删除位置不合法");
        Node<AnyType> node = p;
        p.prior.next = p.next;
        p.next.prior = p.prior;
        size--;
        return node.data;
    }

    public void display() {
        Node<AnyType> p = head.next;
        while (p != head) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    //Test
    public static void main(String[] args) throws Exception {
        LinkedListOfDuplex<Integer> list = new LinkedListOfDuplex<>();
        //添加数据
        for (int i = 0; i < 6; i++)
            list.add(list.length(), i);
        list.display();
        //单链表的长度
        System.out.println("单链表的长度：" + list.length());
        //输出第 i 个元素，第 0 个开始
        System.out.println("输出第 i 个元素：" + list.get(2));
        list.reverse();
        list.display();
        //删除元素
        System.out.println("删除元素：" + list.remove(2));
        list.display();

    }
}
