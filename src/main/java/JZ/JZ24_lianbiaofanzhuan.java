package JZ;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @title: JZ.JZ24_lianbiaofanzhuan
 * @Author LeeX
 * @Date: 2022/2/26 21:41
 * @Version 1.0
 */
public class JZ24_lianbiaofanzhuan {
    /*
        利用栈
     */
    public ListNode ReverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode newlist=null;
        ListNode t_head = null; //用来得到头部
        if(head!=null){
            stack.push(head);
            while(head.next!=null){
                head = head.next;
                stack.push(head);
            }

            if(!stack.empty()){
                newlist = new ListNode(stack.pop().val);
                //因为是值赋值，所以t_head
                t_head = newlist;
                while (!stack.empty()){
                    ListNode t = new ListNode(stack.pop().val);
                    newlist.next=t;
                    newlist=newlist.next;
                }

            }
        }
        return t_head;
    }


    /*

    */
//    public JZ.ListNode ReverseList2(JZ.ListNode head) {
//        JZ.ListNode newHead = null;
//        while (head != null) {
//            JZ.ListNode t = head.next;
//
//        }
//        return
//    }

    @Test
    public void test(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        ListNode t = ReverseList(null);
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
