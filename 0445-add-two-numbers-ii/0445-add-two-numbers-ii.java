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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return last;

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1p = reverse(l1);
        ListNode h2p = reverse(l2);
        ListNode answer = new ListNode();
        int carry=0;
        int sum=0;
        while(h1p!=null || h2p!=null){
            sum = carry;
            if(h1p!=null){
                sum+=h1p.val;
                h1p=h1p.next;
            }
            if(h2p!=null){
                sum += h2p.val;
                h2p = h2p.next;
            }
            carry = sum/10;
            answer.val = sum%10;
            ListNode dummy = new ListNode(carry);
            dummy.next= answer;
            answer = dummy;
        }
        return carry==0?answer.next:answer;
    }
}