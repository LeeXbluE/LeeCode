package com.leex.alg.BM;

import java.util.Stack;

/**
 * @title: BM43_Min_Stack
 * @Author LeeX
 * @Date: 2022/5/21 23:00
 * @Version 1.0
 */
public class BM43_Min_Stack {

    /*
    1. 双栈法
     */
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
        if(stack2.empty()){
           stack2.push(node);
        }else{
            if(stack2.peek()>stack1.peek()){
                stack2.push(node);
            }else{
                stack2.push(stack2.peek());
            }
        }
    }

    public Integer pop() {
        stack2.pop();
        return stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }

}
