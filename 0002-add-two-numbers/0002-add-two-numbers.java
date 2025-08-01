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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int q=0;
        ListNode res= new ListNode(0);
        ListNode temp = res;

        while(l1 != null || l2 != null){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            sum = val1 + val2 + q;
            q= sum / 10;
            sum = sum % 10;
            
            temp.next = new ListNode(sum);
            temp= temp.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

            if(q > 0){
                temp.next = new ListNode(q);
            }
        return res.next;
    }
}