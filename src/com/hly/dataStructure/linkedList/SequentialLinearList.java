package com.hly.dataStructure.linkedList;

import java.util.Arrays;
/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/8
 */
//线性表顺序存储
public class SequentialLinearList<E> {

    //线性表存储空间
    private Object[] listElem;
    //线性表长度
    private int len;

    //初始化线性表的大小
    public SequentialLinearList(int maxLen) {
        len = 0;
        listElem = new Object[maxLen];
    }

    //将线性表置空
    public void clear() {
        len = 0;
    }

    //判断线性表是否为空
    public boolean isEmpty() {
        return len == 0;
    }

    //返回线性表中元素的个数
    public int length() {
        return len;
    }

    //返回线性表中第 i 个数据
    public E get(int i) throws Exception {
        if (i < 0 || i >= len)
            throw new Exception("查找范围不正确,第" + i + "个元素不存在");
        return (E) listElem[i];
    }

    //在第 i 个数据之前插入数据
    public void insert(int i, E e) throws Exception {
        if (i < 0 || i > len)
            throw new Exception("插入范围不正确,第" + i + "个元素不存在");
        //若线性表已满，则扩容一倍
        if (len == listElem.length)
            listElem = Arrays.copyOf(listElem, 2 * listElem.length);
        //数据后移一位，让j=i时挑出，将数据插入i
        for (int j = len; j > i; j--)
            listElem[j] = listElem[j - 1];
        listElem[i] = e;
        len++;
    }

    //删除并返回线性表中第 i 个数据
    public E remove(int i) throws Exception {
        if (i < 0 || i >= len)
            throw new Exception("删除范围不正确,第" + i + "个元素不存在");
        E e = (E) listElem[i];
        //j=len-1 时跳出循环，最后一步为 listElem[len-2] = listElem[len-1]
        for (int j = i; j < len - 1; j++)
            listElem[j] = listElem[j + 1];
        len--;
        return e;
    }

    //返回线性表中数据元素的位序号，若线性表中不包含返回-1
    public int indexOf(E e) {
        for (int i = 0; i < len; i++) {
            if (listElem[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //输出线性表中的元素
    public void display() {
        for (int i = 0; i < len; i++)
            System.out.print(listElem[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        SequentialLinearList<Character> list = new SequentialLinearList<>(3);
        list.insert(0, 'a');
        list.insert(1, 'b');
        list.insert(2, 'c');
        list.remove(2);
        list.display();
        list.get(1);
        System.out.println(list.indexOf('a'));
        list.insert(2,'c');
        list.insert(3,'d');
        System.out.println(list.length());
        System.out.println(list.listElem.length);

    }
}
