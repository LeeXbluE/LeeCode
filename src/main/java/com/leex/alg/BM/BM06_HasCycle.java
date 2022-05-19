package com.leex.alg.BM;

import com.leex.alg.ListNode;

/**
 * @title: BM06_mergeKLists
 * @Author LeeX
 * @Date: 2022/5/19 0:06
 * @Version 1.0
 */
public class BM06_HasCycle {

    /*
    1. 快慢指针，如果有环，迟早追上，如果无环会 null返回。
    2. 使用哈希表
     */

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) { //注意后半部分的判断容易忽视。
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }


}
