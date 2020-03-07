package com.hly.leetCode.everyday;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/7
 * @QQ :1136513099
 * @desc : 面试题59 - II. 队列的最大值
 * 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 * 输入:
 * ["MaxQueue","pop_front","max_value"]
 * [[],[],[]]
 * 输出: [null,-1,-1]
 */
public class MaxQueue {

    //解法1：双端队列
    Queue<Integer> que;
    Deque<Integer> deq;
    public MaxQueue() {
        que = new LinkedList<>();//插入，删除
        deq = new LinkedList<>();//双端队列，获取最大值

    }

    //获取最大值
    public int max_value() {
        return deq.size()>0?deq.peek():-1;//双端队列队首为最大值

    }

    //入队
    public void push_back(int value) {
        que.offer(value);
        //队尾的值如果小于当前值，则删掉
        while (deq.size()>0&&deq.peekLast()<value){
            deq.pollLast();
        }
        deq.offerLast(value);

    }

    //出队
    public int pop_front() {
        int tmp = que.size()>0?que.poll():-1;
        if(deq.size()>0&&tmp == deq.peek()){
            deq.poll();
        }
        return tmp;
    }


    public static void main(String[] args) {
    }
}
