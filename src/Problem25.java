/**
 * @auther: WJoe
 * @Description:
 * @Date : 16:34 2018/8/1
 */
public class Problem25 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null)
            return null;
        RandomListNode head = pHead;
        while (pHead != null) {
            RandomListNode newNode = new RandomListNode(pHead.label);
            newNode.next = pHead.next;
            pHead.next = newNode;
            pHead = newNode.next;
        }
        RandomListNode head1 = head;
        while (head != null && head.next != null) {
            if (head.random != null) {
                head.next.random = head.random.next;
            }
            head = head.next.next;
        }
        RandomListNode head2 = head1.next;
        RandomListNode temp = null;
        pHead = head1;
        while (pHead.next != null) {
            temp = pHead.next;
            pHead.next = temp.next;
            pHead = temp;
        }
        return head2;
    }
}
