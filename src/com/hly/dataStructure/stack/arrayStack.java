package com.hly.dataStructure.stack;

import java.util.Arrays;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/4
 */
//数组方式实现栈
public class arrayStack<E> {

    private Object[] stack;
    private int size;

    public arrayStack() {
        stack = new Object[10];//初始化长度
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) stack[size - 1];
    }

    //出栈
    public E pop() {
        E e = peek();
        stack[size - 1] = null;
        size--;
        return e;
    }

    //入栈
    public E push(E element) {
        ensureCapacity(size + 1);
        stack[size++] = element;
        return element;
    }

    //检查容量
    private void ensureCapacity(int size) {
        int len = stack.length;
        if (size > len) {
            int newLen = len*2;
            stack = Arrays.copyOf(stack, newLen);
        }
    }
}
