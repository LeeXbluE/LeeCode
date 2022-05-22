package com.leex.alg.BM;

import com.leex.alg.ListNode;

/**
 * @title: BM11_addInList4
 * @Author LeeX
 * @Date: 2022/5/21 11:09
 * @Version 1.0
 */
public class BM15_DeleteDuplicates1 {

    /* 删除给出链表中的重复元素（链表中元素从小到大有序），使链表中的所有元素都只出现一次
        1. 双指针，如果不同则俩指针都往前移
        2. 递归 与递归逆置链表很像
     */
    public ListNode deleteDuplicates1 (ListNode head) {
        return null;
    }

    public ListNode deleteDuplicates2 (ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        head.next = deleteDuplicates2(head);
        if(head.val == head.next.val){
            head = head.next;
        }
        return head;
    }



}
