class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null){
            return list1 == null? list2 : list1;
        }
        ListNode result;
        if(list1.val<list2.val){
            result=list1;
            result.next=mergeTwoLists(list1.next,list2);
        }else{
            result=list2;
            result.next=mergeTwoLists(list1,list2.next);
        }
        return result;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ListNode dummy = new ListNode(-10000);

        ListNode temp = dummy;
        for (ListNode list : lists) {
            temp = mergeTwoLists(temp, list); 
        }
        return temp.next;
    }
}