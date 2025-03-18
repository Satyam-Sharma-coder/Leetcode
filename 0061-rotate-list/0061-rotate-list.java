/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int c=1;
        ListNode l1=head;
        while(l1.next!=null){
            l1=l1.next;
            c++;
        }
        l1.next = head;

        k = k % c;
        int pos = c - k;
        ListNode head2 = head;
        for (int i = 1; i < pos; i++) {
            head2 = head2.next;
        }
        ListNode newHead = head2.next;
        head2.next = null;

        return newHead;

    }
}