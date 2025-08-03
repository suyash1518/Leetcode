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
    public ListNode deleteMiddle(ListNode head) {
        
        int cnt =0;
        ListNode temp= head;

        while(temp != null){
            temp= temp.next;
            cnt++;
        }
        if(cnt == 1) return null;

        int mid= (cnt/2) +1;
        temp =head;

        for(int i=0; i< mid-2 ; i++){
         temp = temp.next;
        } 
        if (temp != null && temp.next != null){
        temp.next= temp.next.next;
        }
        return head;
    }
}