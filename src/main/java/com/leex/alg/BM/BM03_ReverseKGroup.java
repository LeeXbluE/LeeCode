package com.leex.alg.BM;

import com.leex.alg.ListNode;
import com.leex.alg.util.ListUtil;

import java.util.Stack;

/**
 * @title: BM03_reverseKGroup
 * @Author LeeX
 * @Date: 2022/5/18 23:52
 * @Version 1.0
 */
public class BM03_ReverseKGroup {

    /*
    1. 使用上题的区间反转，但是性能比较差。
    2. 使用栈
    3. 递归，难，要研究。
     */
    public static ListNode reverseKGroup1(ListNode head, int k) {
        int size = ListUtil.getSize(head);

        int times = size / k;
        for (int i = 0; i < times; ++i) {
            BM02_ReverseBetween.reverseBetween1(head, (k + 1) * i + 1, (k + 1) * (i + 1));  //当k=3 时 ， 1 4 7 10
        }
        return null;
    }

    public static ListNode reverseKGroup2(ListNode head, int k) {
        ListNode substitute_head = head;
        Stack<ListNode> stack = new Stack<>();
        int size = ListUtil.getSize(head);
        int times = size / k;
        for (int i = 0; i < times; ++i) {
            int flag = 0;
            ListNode pre = substitute_head;

            //进行入栈
            while (flag < k) {
                ++flag;
                stack.add(substitute_head);
                substitute_head = substitute_head.next;
            }
            ListNode next = substitute_head.next;

            //进行出栈反转
            while (!stack.empty()) {
                substitute_head.next = stack.pop();
                substitute_head = substitute_head.next;
            }
            //进行拼接，原先为pre的经过反转后为最后的，而next
            pre.next = next;
        }
        return head;
    }

    public static ListNode reverseKGroup3(ListNode head, int k) {

        return head;
    }
}
