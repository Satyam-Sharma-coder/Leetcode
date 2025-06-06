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
        ListNode h1 = reverse(l1);
        ListNode h1p=h1;
        ListNode h2 = reverse(l2);
        ListNode h2p=h2;
        ListNode answer = new ListNode(-1);
        ListNode value = answer;
        ListNode temp=value;
        int carry=0;
        while(h1p!=null && h2p!=null){
            int sum = h1p.val+h2p.val+carry;
            if(sum/10==0){
                ListNode dummy = new ListNode(sum);
                value.next= dummy;
                value=value.next;
                carry=0;
            }else{
                carry = sum/10;
                sum = sum%10;
                ListNode dummy = new ListNode(sum);
                value.next= dummy;
                value=value.next;
            }
            h1p=h1p.next;
            h2p=h2p.next;
        }
        while(h1p!=null){
            int sum = h1p.val+carry;
            if(sum/10==0){
                ListNode dummy = new ListNode(sum);
                value.next= dummy;
                value=value.next;
                carry=0;
            }else{
                carry = sum/10;
                sum = sum%10;
                ListNode dummy = new ListNode(sum);
                value.next= dummy;
                value=value.next;
            }
            h1p=h1p.next;
        }
        while(h2p!=null){
            int sum = h2p.val+carry;
            if(sum/10==0){
                ListNode dummy = new ListNode(sum);
                value.next= dummy;
                value=value.next;
                carry=0;
            }else{
                carry = sum/10;
                sum = sum%10;
                ListNode dummy = new ListNode(sum);
                value.next= dummy;
                value=value.next;
            }
            h2p=h2p.next;
        }
        if(carry !=0){
            ListNode dummy = new ListNode(carry);
            value.next= dummy;
        }
        ListNode result =  reverse(answer.next);
        return result;
    }
}