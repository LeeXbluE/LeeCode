package JZ;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Set;

/**
 * @title: JZ.JZ52_findfirstcomonNode
 * @Author LeeX
 * @Date: 2022/2/27 14:11
 * @Version 1.0
 */
public class JZ52_findfirstcomonNode {

    /*
    使用set数据结构
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Set<ListNode> set = new HashSet<>();
        while(pHead1!=null){
            set.add(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            if(set.contains(pHead2))
                return pHead2;
            pHead2=pHead2.next;
        }
        return null;
    }

    /*
    使用差值法
     */
    public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        return null;
    }

    /*
    使用差等值法
     */
    public ListNode FindFirstCommonNode3(ListNode pHead1, ListNode pHead2) {
        return null;
    }




    @Test
    public void test(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(5);
        l.next.next = new ListNode(6);
//        JZ.JZ24_lianbiaofanzhuan.JZ.ListNode t = ReverseList(null);
//        ArrayList x = new ArrayList();

        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(8);

        ListNode gongtongtail = new ListNode(9);
        gongtongtail.next = new ListNode(3);

        l.next.next.next = gongtongtail;
        l2.next.next = gongtongtail;

        ListNode t = FindFirstCommonNode(l,l2);
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
