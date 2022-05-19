package com.leex.alg.BM;

import com.leex.alg.ListNode;

import java.util.ArrayList;

/**
 * @title: BM_MergeKLists
 * @Author LeeX
 * @Date: 2022/5/19 0:05
 * @Version 1.0
 */
public class BM05_MergeKLists {
    /*
    1. 利用上题进行顺序合并
    2. 对1的优化，+分治
    3. ##优先队列###
     */
    public ListNode mergeKLists2(ArrayList<ListNode> lists) {
        return devideMerge(lists, 0, lists.size());
    }

    private ListNode devideMerge(ArrayList<ListNode> lists, int left, int right) {
        if (left > right) {
            return null;
        } else if (left == right) {
            return lists.get(left);
        }
        int mid = (left + right) >> 1;
        return BM04_Merge.merge2(devideMerge(lists, left, mid), devideMerge(lists, mid + 1, right));
    }

    public ListNode mergeKLists3(ArrayList<ListNode> lists) {

    }

}
