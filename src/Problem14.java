/**
 * @auther: WJoe
 * @Description: 输入一个链表，输出该链表中倒数第k个结点。
 * @Date : 19:08 2018/7/30
 */
public class Problem14 {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }


        ListNode second = head;
        for (int i = 0; i < k; i++) {
            if (head ==null)
                return null;
            head = head.next;
        }
        while (head != null) {
            head = head.next;
            second = second.next;
        }
        return second;


    }


}