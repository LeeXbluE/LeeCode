package com.leex.alg.JZ;

import java.util.Stack;

/**
 * @title: JZ30_ContainMin
 * @Author LeeX
 * @Date: 2022/7/23 22:09
 * @Version 1.0
 */
public class JZ30_ContainMin {

    Stack<Integer> s;
    Stack<Integer> minStack = new Stack<>();

    public void MinStack() {
        s = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        s.push(x);
        if (minStack.empty()) {
            minStack.push(x);
        } else {
            if (minStack.peek() < x) {
                minStack.push(minStack.peek());
            } else {
                minStack.push(x);
            }
        }
    }

    public void pop() {
        s.pop();
        minStack.pop();
    }

    public int top() {
        return s.peek();
    }

    public int min() {
        return minStack.peek();
    }

}
