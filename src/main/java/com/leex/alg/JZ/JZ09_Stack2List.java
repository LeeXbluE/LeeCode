package com.leex.alg.JZ;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @title: JZ09_Stack2List
 * @Author LeeX
 * @Date: 2022/7/23 21:57
 * @Version 1.0
 */
public class JZ09_Stack2List {

    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public void CQueue() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (outStack.isEmpty()) {
            if (inStack.isEmpty()) {
                return -1;
            }
            in2out();
        }
        return outStack.pop();
    }

    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }

}
