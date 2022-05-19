package BM;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @title: BM01_ReverseList
 * @Author LeeX
 * @Date: 2022/5/18 22:27
 * @Version 1.0
 */
public class BM01_ReverseList {
    /*
    1.栈
    2.双节点
    3.递归（有两种。思考！！！）
    4.创建新链表，进行头插法
    注：链表为不带头节点的
     */
    public ListNode ReverseList1(ListNode head) {
        //这里是用双向链，也可以使用Stack
        Deque<ListNode> listNodeDeque = new ArrayDeque<>();
        ListNode node = head;
        //将 listnode 入栈
        while (node != null) {
            listNodeDeque.add(head);
            node = head.next;
        }
        //出栈并反转链表
        ListNode newHead = listNodeDeque.pop();
        node = head;
        while (node != null) {
            node.next = listNodeDeque.pop();
            node = node.next;
        }
        return newHead;
    }

    public ListNode ReverseList2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur, pre = null, temp = null;
        cur = head;
        while (cur != null) {
            //断开链表要记录后续一个，防止断链
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    //这种递归往下传递的时候基本上没有逻辑处理，当往回反弹的时候才开始处理，也就是从链表的尾端往前开始处理的。
    public ListNode ReverseList3(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode reverse = ReverseList3(next);
        next.next = head;
        head.next = null;
        return reverse;
    }

    //在链表递归的时候从前往后处理，处理完之后直接返回递归的结果，这就是所谓的尾递归，这种运行效率要比上一种好很多
    public ListNode ReverseList4(ListNode head) {
//https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=295&tqId=23286&ru=%2Fpractice%2Fb58434e200a648c589ca2063f1faf58c&qru=%2Fta%2Fformat-top101%2Fquestion-ranking&sourceUrl=%2Fexam%2Foj
    return null;
    }

    public static void main(String[] args) {

    }
}

