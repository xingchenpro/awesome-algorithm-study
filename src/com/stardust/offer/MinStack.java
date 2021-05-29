package com.stardust.offer;

import java.util.Stack;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/17
 * @desc : 30. 包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 */
public class MinStack {

    Stack<Integer> data;
    Stack<Integer> min;

    public MinStack() {
        data = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
      data.push(x);
      //最小栈为空，或者栈顶元素大于当前值
      if(min.isEmpty()||x<=min.peek()){
          min.push(x);
      }

    }

    public void pop() {
        //出栈
        int x  =data.pop();
        //如果最小站栈栈顶元素等于当前出栈元素，也出栈
        if(min.peek() ==x){
            min.pop();
        }

    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();

    }

}
