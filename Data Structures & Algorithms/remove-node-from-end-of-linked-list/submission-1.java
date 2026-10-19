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
        if(head.next == null && n==1){
            head=null;
            return null;
        }
        int visit = 1;
        ListNode nvisit = head; 
        ListNode tail = head;
        while(tail!=null && tail.next!= null){
            if(n+1<=visit){
                nvisit=nvisit.next;
            }
            tail=tail.next;
            visit++;
        }
        if(visit==n){
            head = head.next;
        } else if(nvisit!=null && nvisit.next!=null){
            nvisit.next = nvisit.next.next;
        }
        return head;
    }
}
