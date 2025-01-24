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
    public ListNode swapPairs(ListNode head) {
        ListNode d= new ListNode(-1,head);

        ListNode prev=d, curr=head;
        while(curr!= null && curr.next!=null){
            ListNode nxt=curr.next.next;

            ListNode sec=curr.next;


            sec.next=curr;
            curr.next=nxt;
            prev.next=sec;

            prev=curr;
            curr=nxt;


        }
        return d.next;
    }
}