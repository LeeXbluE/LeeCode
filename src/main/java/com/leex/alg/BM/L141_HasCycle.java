package com.leex.alg.BM;

import com.leex.alg.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 李翔
 * @date 2023/4/28
 * @description
 */
public class L141_HasCycle {

    public boolean hasCycle(ListNode head) {
        Set set = new HashSet();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

}
