package com.leex.alg.JZ;

import org.junit.Test;

import java.sql.ResultSet;

/**
 * @title: com.leex.agl.JZ.JZ35_lianbiao_Clone
 * @Author LeeX
 * @Date: 2022/2/27 16:07
 * @Version 1.0
 */
public class JZ35_CopyRandomList {


    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Node dummy = head;
        Node newNode = null;
        Node nextNode = null;

        while (dummy != null) {
            nextNode = dummy.next;
            newNode = new Node(dummy.val);
            newNode.next = nextNode;
            newNode.random = null;

            dummy.next = newNode;
            dummy = nextNode;
        }

        dummy = head.next;
        while (dummy != null) {
            dummy.random = dummy.next == null ? null : dummy.next.random.next;
            dummy = dummy.next == null ? null : dummy.next.next;
        }
        Node originHead = head;
        Node res = head.next;
        dummy = head.next;
        while (dummy != null && originHead != null) {

            originHead.next = dummy.next;
            originHead = dummy.next;

            dummy.next = originHead == null ? null : originHead.next;

        }
        return res;

    }


    @Test
    public void test() {
        Node l = new Node(1);
        l.next = new Node(2);
        l.next.next = new Node(3);
        l.random = l.next.next;
        l.next.random = l;
        l.next.next.random = l.next;


        copyRandomList(l);
        Node dummy = l;
        while (dummy != null) {
            System.out.println(dummy.val);
            dummy = dummy.next;
        }
        dummy = l;
        while (dummy != null) {
            System.out.println(dummy.random.val);
            dummy = dummy.next;
        }
    }
   /* public class RandomListNode {
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

    }*/

}
