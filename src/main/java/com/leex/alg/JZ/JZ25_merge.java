package com.leex.alg.JZ;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @title: com.leex.agl.JZ.JZ25_merge
 * @Author LeeX
 * @Date: 2022/2/27 13:39
 * @Version 1.0
 */
public class JZ25_merge {

        /*
        法一：利用迭代。
         */
        public ListNode Merge(ListNode list1,ListNode list2) {
            ListNode head = null;
            ListNode tail = null;
            if(list1==null)
                return list2;
            else if(list2==null)
                return list1;

            if(list1.val<list2.val) {
                head = list1;
                tail = list1;
                list1 = list1.next;
            }
            else {
                head = list2;
                tail = list2;
                list2 = list2.next;
            }

            while(list1 != null && list2 != null){

                if(list1.val<list2.val) {
                    tail.next = list1;
                    tail = list1;
                    list1 = list1.next;
                }else{
                    tail.next = list2;
                    tail = list2;
                    list2 = list2.next;
                }

            }
            if(list1==null){
                tail.next = list2;
            }else{
                tail.next = list1;
            }


            return head;
        }

    /*
   法二：利用递归。
    */
    public ListNode Merge2(ListNode list1,ListNode list2) {

        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        else if(list1.val<list2.val){
            list1.next = Merge2(list1.next,list2);
            return list1;
        }else{
            list2.next = Merge2(list1,list2.next);
            return list2;
        }
    }


    @Test
    public void test(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(5);
        l.next.next = new ListNode(6);
//        com.leex.agl.JZ.JZ24_lianbiaofanzhuan.com.leex.agl.JZ.com.leex.agl.ListNode t = ReverseList(null);
//        ArrayList x = new ArrayList();

        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(9);


        ListNode t = Merge(l,l2);
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
