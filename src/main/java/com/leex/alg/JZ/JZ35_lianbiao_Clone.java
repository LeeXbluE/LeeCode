package com.leex.alg.JZ;

import org.junit.Test;

/**
 * @title: com.leex.agl.JZ.JZ35_lianbiao_Clone
 * @Author LeeX
 * @Date: 2022/2/27 16:07
 * @Version 1.0
 */
public class JZ35_lianbiao_Clone {

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        RandomListNode dummy = pHead;
        while(dummy!=null){
            RandomListNode newNode = new RandomListNode(dummy.label);
            newNode.next=dummy.next;

            dummy.next = newNode;
            dummy=dummy.next.next;
        }
        dummy = pHead;
        while(dummy!=null){
            dummy.next.random=dummy.random.next;
        }
        pHead=pHead.next;
        dummy = pHead;
        while(dummy!=null){
            dummy.next=dummy.next.next;
        }


        return pHead;
    }

    @Test
    public void test(){
        RandomListNode l = new RandomListNode(1);
        l.next=new RandomListNode(2);
        l.next.next=new RandomListNode(3);
        l.random=l.next.next;
        l.next.random=l;
        l.next.next.random=l.next;

        RandomListNode dummy = l;
        while(dummy!=null){
            System.out.println(dummy.label);
            dummy = dummy.next;
        }
        dummy = l;
        while(dummy!=null){
            System.out.println(dummy.random.label);
            dummy = dummy.next;
        }

    }

}
