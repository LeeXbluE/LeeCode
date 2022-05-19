package JZ;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @title: JZ.JZ22_daoshukjiedian
 * @Author LeeX
 * @Date: 2022/2/27 15:32
 * @Version 1.0
 */
public class JZ22_daoshukjiedian {

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
    public ListNode FindKthToTail2 (ListNode pHead, int k) {
        return null;
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



        ListNode t = FindKthToTail(l,2);

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
