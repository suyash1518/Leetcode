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
    public ListNode middleNode(ListNode head) {
        int count=0; 
        ListNode temp=head;

        while(temp.next != null){
            count++;
            temp=temp.next;
        }
        int middle= count/2;
        temp =head;
        for(int i= middle; i<count; i++){
            temp= temp.next;
        }
        return temp;
    }
}