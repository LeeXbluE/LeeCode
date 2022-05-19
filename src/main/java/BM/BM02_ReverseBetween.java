package BM;

/**
 * @title: BM02_
 * @Author LeeX
 * @Date: 2022/5/18 23:23
 * @Version 1.0
 */
public class BM02_ReverseBetween {
    /*
    1. 直接利用上题的方法,寻找区间交接处的四个结点。
    2. 一次遍历（对 1 的优化，有点像头插法？）
    3. 使用栈
     */

    /*
    时间复杂度：O(N) 其中 N是链表总节点数。最坏情况下，需要遍历整个链表
    空间复杂度O(1) 仅使用到常数个变量
     */
    public ListNode reverseBetween1(ListNode head, int m, int n) {
        // write code here
        ListNode result = head;
        ListNode pre = null;
        if (m < 0) return null;
        int step = 0;
        //找到第m个节点作为反转链表的开始节点并记录，第m个节点的pre作为嫁接。
        while (step < m) {
            ++step;
            pre = head;
            head = head.next;
        }
        ListNode newHead = head;
        //找到第 n个节点的next作为嫁接节点
        while (step < n) {
            ++step;
            head = head.next;
        }
        if (head == null) return null;

        ListNode jiajie = head.next;
        head.next = null;

        //开始区间反转
        BM01_ReverseList reverseList = new BM01_ReverseList();
        ListNode t = reverseList.ReverseList1(newHead);
        //开始嫁接
        pre.next = t;
        newHead.next = jiajie;  //注，newHead 经过翻转后，现在是尾巴。

        return result;
    }

    public ListNode reverseBetween2 (ListNode head, int m, int n) {
        //设置虚拟头节点
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next =head;
        ListNode pre = dummyNode;
        for(int i=0;i<m-1;i++){
            pre = pre.next;
        }

        ListNode cur = pre.next;
        ListNode Cur_next ;
        for(int i=0;i<n-m;i++){
            Cur_next = cur.next;
            cur.next = Cur_next.next;
            Cur_next .next = pre.next;
            pre.next = Cur_next ;
        }
        return dummyNode.next;
    }

}
