package com.leex.alg.BM;

import java.util.Stack;

/**
 * @title: BM42
 * @Author LeeX
 * @Date: 2022/5/21 22:46
 * @Version 1.0
 */
public class BM42_Stack2List {
    Stack<Integer> stack1 = new Stack<Integer>(); //压入的
    Stack<Integer> stack2 = new Stack<Integer>(); //弹出的

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
