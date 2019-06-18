package com.hly.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

class Task implements Comparable<Task>{
	
	private int value = 0;

	@Override
	public int compareTo(Task o) {
		return this.getValue() > o.getValue() ? 1 : -1;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

public class QueueTest {
	
	
	public static void main(String[] args) {
		//等待队列
		//排队场景 如果一个系统流量高 要做这种排队系统 
		//Mq消息队列
		//做阻塞 take();		//
	
		//优先队列 在做一个排队场景的时候，比如有VIP 可以让VIP排前面
		//ArrayBlockingQueue 基于数组的阻塞队列 有界		take();一直会阻塞到有数据为止 可以用在并发场景
		//LinkedBlockingQueue这个是无界队列 不要爆内存
		
		//DelayQueue<Delayed> 带延时的 连接池的关闭，任务超时间了
		//List<Task> queue = new ArrayList<>();
		PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<Task>();
		Task e = new Task();
		e.setValue(3);
		queue.add(e);
		
		Task b = new Task();
		b.setValue(2);
		queue.add(b);
		queue.forEach(s-> System.out.println(s.getValue()));
		
	}
}
