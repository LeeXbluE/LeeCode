package com.leex.alg.util;

import com.leex.alg.ListNode;

/**
 * @title: ListUtil
 * @Author LeeX
 * @Date: 2022/5/19 21:52
 * @Version 1.0
 */
public class ListUtil {

    public static int getSize(ListNode head){
        int size=0;
        while (head != null) {
            head = head.next;
            ++size;
        }
        return size;
    }
}
