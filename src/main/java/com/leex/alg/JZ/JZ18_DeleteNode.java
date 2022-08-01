package com.leex.alg.JZ;

import com.leex.alg.ListNode;

import java.util.Objects;

/**
 * @title: JZ18_DeleteNode
 * @Author LeeX
 * @Date: 2022/8/1 18:26
 * @Version 1.0
 */
public class JZ18_DeleteNode {

    public ListNode deleteNode(ListNode head, int val) {
        if (Objects.isNull(head)) {
            return head;
        }
        ListNode res = head;
        ListNode before = head;
        int flag = 0;
        while(Objects.nonNull(head)){
            if(flag == 0 && head.val == val){
                return res.next;
            }else if (head.val == val){
                before.next = head.next;
            }
            before = head;
            head = head.next;
            flag ++;
        }
        return res;
    }
}
