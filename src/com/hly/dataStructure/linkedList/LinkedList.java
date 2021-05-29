package com.hly.dataStructure.linkedList;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/8
 */

//带头结点的单链表
public class LinkedList<AnyType extends Comparable<? super AnyType>> {

    //定义静态内部类节点
    private static class Node<AnyType>{

        public AnyType data;
        public Node<AnyType> next;

        public Node() {
            this(null,null);
        }

        public Node(AnyType data) {
            this.data = data;
        }

        public Node(AnyType data, Node<AnyType> next) {
            this.data = data;
            this.next = next;
        }
    }

    //头指针
    private Node<AnyType> head; //头指针
    private int size;

    public LinkedList() {
        size = 0;
        head = new Node<>();//初始化头结点
    }

    public LinkedList(Node<AnyType> head, int size) {
        this.head = head;
        this.size = size;
    }

    public int size(){
        return size;
    }

    //将单链表置成空表
    public void clear(){
        head.data = null;
        head.next = null;
    }

    //判断单链表是否为空
    public boolean isEmpty(){
        return head.next == null;
    }

    //求单链表的长度
    public int length(){
        int length = 0;
        Node<AnyType> p = head.next;//从首节点开始计数
        while(p!=null){
            p = p.next;
            length ++ ;
        }
        return length;
    }

    //获取第 i 个节点
    public AnyType get(int i) throws Exception {
        Node<AnyType> p = head.next;
        int j = 0;
        while (j<i&&p!=null){
            p = p.next;
            j++;
        }
        //两种为空的情况
        //1.j>i,i<0时不合法
        //p==null,说明了已经退出了while循环，i大于了表长-1
        if(p==null||j>i)
            throw new Exception("第"+i+"个节点不存在！");
        return p.data;
    }

    //在单链表中第i个节点前插入一个新的值
    public void add(int i,AnyType data) throws Exception {
        int j = -1;
        Node<AnyType> p = head;//p为头结点
        //找到 i 的前驱节点 p
        while(j<i-1&&p!=null){
            p = p.next;
            j++;
        }
        if(j>i-1||p ==null)
            throw new Exception("插入位置不合法");
        Node<AnyType> s = new Node<>(data);
        s.next = p.next;
        p.next = s;
    }

    //删除单链表中第 i 个节点,返回该节点
    public AnyType remove(int i) throws Exception {
        Node<AnyType> p = head;
        int j = -1;
        while(j<i-1&&p.next!=null){
            p = p.next;
            j++;
        }
        if(j>i-1||p.next==null)
            throw new  Exception("删除位置不合法");
        Node<AnyType> node = p.next;
        p.next = p.next.next;
        return node.data;
    }


    //查找到值为x的节点
    public int indexOf(AnyType x){
        Node<AnyType> p = head.next;
        int i = 0;
        while (p!=null&&!p.data.equals(x)){
                p = p.next;
                i++;
        }
        if(p!=null)//遍历单链表，如果 p 为 null 则说明没有找到
            return i;
        return -1;
    }

    //输出所有的节点
    public void display(){
        Node<AnyType> p = head.next;//取出带头结点的首节点
        while(p!=null){
            System.out.print(p.data+" ");
            p = p.next;
        }
        System.out.println();
    }

    //Test
    public static void main(String[] args) throws Exception {

        LinkedList<Integer> list  = new LinkedList<>();
        //添加数据
        for(int i=0;i<3;i++)
            list.add(list.length(),i);
        list.display();
        //单链表的长度
        System.out.println("单链表的长度："+list.length());
        //查找值为 x 的节点
        System.out.println("查找值为 x 的节点："+list.indexOf(2));
        //删除元素
        System.out.println("删除元素："+list.remove(2));
        list.display();
    }
}


