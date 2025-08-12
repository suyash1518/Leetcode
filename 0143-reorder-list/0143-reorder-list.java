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
    public void reorderList(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        while(fast.next != null && fast.next.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }

        ListNode second= reverseList(slow.next);
        slow.next = null;

        ListNode first= head;
        while(second != null){
            ListNode t1= first.next;
            ListNode t2= second.next;

            first.next= second;
            second.next= t1;

            first= t1;
            second= t2;
        }  
    }
        
    private ListNode reverseList(ListNode head){
        ListNode prev = null, curr = head;
        while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
    }
}