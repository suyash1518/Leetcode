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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp= head;
        ListNode dummy= new ListNode(0);
        ListNode curr = dummy;
        int count=1;
        Queue<Integer> queue= new LinkedList<>();

        while(temp != null){
            if( count % 2 !=0){
            curr.next =new ListNode(temp.val); 
            curr= curr.next;          
        } else{
            queue.offer(temp.val);
        }
            temp= temp.next;
            count++;
        }
        while( !queue.isEmpty()){
            curr.next= new ListNode(queue.poll());
            curr = curr.next;
        }
        return dummy.next;
    }
}