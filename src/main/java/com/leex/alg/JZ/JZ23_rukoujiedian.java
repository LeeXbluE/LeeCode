package com.leex.alg.JZ;

import com.leex.alg.ListNode;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @title: com.leex.agl.JZ.JZ23_rukoujiedian
 * @Author LeeX
 * @Date: 2022/2/27 15:16
 * @Version 1.0
 */
public class JZ23_rukoujiedian {
    /*
    使用Set
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        Set<ListNode> set = new HashSet<>();
        while(pHead!=null){
            if(set.contains(pHead))
                return pHead;
            set.add(pHead);
            pHead=pHead.next;
        }
        return null;
    }

    /*
    利用快慢指针，比较难。
     */
    public ListNode EntryNodeOfLoop2(ListNode pHead) {

        return null;
    }

    @Test
    public void test(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);

        ListNode gongtong = new ListNode(4);
        gongtong.next = new ListNode(5);
        gongtong.next.next = new ListNode(6);
        gongtong.next.next.next = gongtong;

        l.next.next.next =gongtong;


        ListNode t = EntryNodeOfLoop(l);

        System.out.println(t.val);
//        ArrayList x = new ArrayList();
//
//        if(t!=null){
//            x.add(t.val);
//            t=t.next;
//            while (t!=null){
//                x.add(t.val);
//                t=t.next;
//            }
//        }
//
//        System.out.println(x);
    }
}
