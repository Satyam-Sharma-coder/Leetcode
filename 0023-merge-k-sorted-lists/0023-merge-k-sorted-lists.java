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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null){
            return list1 == null? list2 : list1;
        }
        if(list1.val>list2.val){
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ListNode dummy = new ListNode(-10000); // Dummy node

        ListNode temp = dummy; // Start merging from dummy.next
        for (ListNode list : lists) {
            temp = mergeTwoLists(temp, list); // Merge iteratively
        }
        return temp.next; // Return merged list

    }
}


//  -10000--> 1-> 4 -->5
// 1  --> 4 --> 5
//  1--> 3 --> 4



// -10000 --> 1--> 1 --> 3 --> 4-->4-->5
// 2-->6