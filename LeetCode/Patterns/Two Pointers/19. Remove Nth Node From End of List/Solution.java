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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null&&n==1) return null;
        ListNode curr=head;
        ListNode fast=head;
        int i=0;
        while(i<n&& fast!=null){
            fast=fast.next;
            i++;
        }
        ListNode prev=curr;
        while(curr!=null&&fast!=null){
            prev=curr;
            curr=curr.next;
            fast=fast.next;
        }
        prev.next=curr.next;
        return head;
    }
}