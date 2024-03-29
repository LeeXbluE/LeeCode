package com.leex.alg.JZ;

import com.leex.alg.ListNode;
import com.leex.alg.util.ListUtil;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @title: JZ6_tail2head_print
 * @Author LeeX
 * @Date: 2022/2/13 22:40
 * @Version 1.0
 */
public class JZ06_tail2head_print {
    //JZ6

    public int[] reversePrint(ListNode head) {
        int length = getSize(head);
        int flag = 1;

        int[] res = new int[length];
        while(head!=null){
            res[length-flag] = head.val;
            flag ++;
            head = head.next;
        }

        return res;

    }

    private int getSize(ListNode head){
        int size=0;
        while (head != null) {
            head = head.next;
            ++size;
        }
        return size;
    }


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ListNode t = listNode;
        if (listNode == null)
            return new ArrayList<>();
        int length = 1;
        while (t.next != null) {
            t = t.next;
            length++;
        }
        System.out.println("zhelishi:length:" + length);

        ArrayList<Integer> s = new ArrayList<>();
        t = listNode;
        for (int i = 0; i < length; i++) {
            s.add(t.val);
            t = t.next;
        }
        for (int i = 0; i < length / 2; i++) {
            int tag = s.get(i);
            s.set(i, s.get(length - 1 - i));
            s.set(length - 1 - i, tag);
        }
        return s;
    }

    @Test
    public void test() {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        System.out.println(printListFromTailToHead(null));
    }
}
