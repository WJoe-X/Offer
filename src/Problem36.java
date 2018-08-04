/**
 * @auther: WJoe
 * @Description: 输入两个链表，找出它们的第一个公共结点。
 * @Date : 16:52 2018/8/3
 */
public class Problem36 {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null)
            return null;
        int count1 = 0;
        int count2 = 0;
        ListNode head1 = pHead1;
        ListNode head2 = pHead2;
        while (pHead1 != null) {
            count1++;
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            count2++;
            pHead2 = pHead2.next;
        }
        while (count1 > count2) {
            head1 = head1.next;
            count1--;
        }
        while (count1 < count2) {
            head2 = head2.next;
            count2--;
        }

        while (head1 != null && head2 != null) {
            if (head1 == head2)
                return head1;
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;

    }
}
