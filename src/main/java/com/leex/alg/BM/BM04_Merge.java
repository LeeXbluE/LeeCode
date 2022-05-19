package com.leex.alg.BM;

import com.leex.alg.ListNode;

/**
 * @title: BM04_Merge
 * @Author LeeX
 * @Date: 2022/5/19 0:02
 * @Version 1.0
 */
public class BM04_Merge {
    /*
    1. 迭代
    2. 递归
    3. 入住数组，这就没意思了。
     */
    public static ListNode merge1(ListNode list1, ListNode list2) {
        ListNode head, dummyHead = new ListNode(-1);
        head = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dummyHead.next = list1;
                list1 = list1.next;
            } else {
                dummyHead.next = list2;
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            dummyHead.next = list2;
        } else {
            dummyHead.next = list1;
        }
        //因为用的是带头节点
        return head.next;
    }

    //merge2 返回的是合并后的头节点
    public static ListNode merge2(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        if (list1.val < list2.val) {
            list1.next = merge2(list1.next, list2);
            return list1;
        } else {
            list2.next = merge2(list1, list2.next);
            return list2;
        }
    }



}
