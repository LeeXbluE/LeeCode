package com.leex.alg.JZ;

import com.leex.alg.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @title: com.leex.agl.JZ.JZ24_lianbiaofanzhuan
 * @Author LeeX
 * @Date: 2022/2/26 21:41
 * @Version 1.0
 */
public class JZ24_lianbiaofanzhuan {
    /*
        利用栈
     */
    public ListNode ReverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode newlist=null;
        ListNode t_head = null; //用来得到头部
        if(head!=null){
            stack.push(head);
            while(head.next!=null){
                head = head.next;
                stack.push(head);
            }

            if(!stack.empty()){
                newlist = new ListNode(stack.pop().val);
                //因为是值赋值，所以t_head
                t_head = newlist;
                while (!stack.empty()){
                    ListNode t = new ListNode(stack.pop().val);
                    newlist.next=t;
                    newlist=newlist.next;
                }

            }
        }
        return t_head;
    }


    /*

    */
//    public com.leex.agl.JZ.com.leex.agl.ListNode ReverseList2(com.leex.agl.JZ.com.leex.agl.ListNode head) {
//        com.leex.agl.JZ.com.leex.agl.ListNode newHead = null;
//        while (head != null) {
//            com.leex.agl.JZ.com.leex.agl.ListNode t = head.next;
//
//        }
//        return
//    }

    @Test
    public void test(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        ListNode t = ReverseList(null);
        ArrayList x = new ArrayList();

        if(t!=null){
            x.add(t.val);
            t=t.next;
            while (t!=null){
                x.add(t.val);
                t=t.next;
            }
        }

        System.out.println(x);
    }
}
