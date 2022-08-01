package com.leex.alg.JZ;

import com.leex.alg.ListNode;
import org.junit.Test;
import sun.reflect.generics.scope.DummyScope;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @title: com.leex.agl.JZ.JZ22_daoshukjiedian
 * @Author LeeX
 * @Date: 2022/2/27 15:32
 * @Version 1.0
 */
public class JZ22_GetKthFromEnd {

    /*
    暴力求解，先算长度
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        int length =0;
        ListNode dummy = pHead;
        while(pHead!=null){
            length++;
            pHead = pHead.next;
        }
        if(k>length)
            return null;
        for(int i=0;i<length-k;i++){
            dummy=dummy.next;
        }

        return dummy;
    }

    /*
    利用快慢指针
     */
    public ListNode getKthFromEnd (ListNode head, int k) {
        if (Objects.isNull(head)) {
            return head;
        }
        int gap = k;
        ListNode dummyfirst = head;
        ListNode dummySecond = head;
        while (Objects.nonNull(dummySecond)) {
            if (gap >= 0) {
                gap--;
            }
            if (gap < 0) {
                dummyfirst = dummyfirst.next;
            }
            dummySecond = dummySecond.next;
        }
        return dummyfirst;
    }

    /*
    利用空指针
     */
    public ListNode FindKthToTail3 (ListNode pHead, int k) {
        return null;
    }

    @Test
    public void test(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);



        ListNode t = getKthFromEnd(l,2);

        ArrayList x = new ArrayList();

        if(t!=null){
            x.add(t.val);
            t=t.next;
            while (t!=null){
                x.add(t.val);
                t=t.next;
            }
        }

        System.out.println(x);
    }


}
