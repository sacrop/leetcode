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
        ListNode dummyHead=new ListNode(0,head);
        ListNode curr=dummyHead;
        ListNode fast=dummyHead;
        for (int i = 0; i <n; i++) {
            fast = fast.next;
        }
        ListNode prev=curr;
        while(curr!=null&&fast!=null){
            prev=curr;
            curr=curr.next;
            fast=fast.next;
        }
        prev.next=curr.next;
        return dummyHead.next;
    }
}