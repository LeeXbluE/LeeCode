package com.leex.alg.BM;

import com.leex.alg.ListNode;

/**
 * @title: BM15_DeleteDuplicates2
 * @Author LeeX
 * @Date: 2022/5/21 19:08
 * @Version 1.0
 */
public class BM17_DeleteDuplicates2 {
    /*
        给出一个升序排序的链表，删除链表中的所有重复出现的元素，只保留原链表中只出现一次的元素。
       1. 双指针， 可以判断 head.next.val == head.next.next.val 然后通过while来跳出重复的。
       2. 利用递归
     */
    public static ListNode deleteDubpicate1(ListNode head){

        return null;
    }

    public static ListNode deleteDubpicate2(ListNode head){

        if(head == null){
            return head;
        }
        if(head.next!=null&&head.val==head.next.val){
            while(head!=null && head.val == head.next.val){
                head= head.next;
            }
            return deleteDubpicate2(head.next);
        }
        head.next = deleteDubpicate2(head.next);
        return head;
    }


}
