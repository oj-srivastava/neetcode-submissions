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
        ListNode op = new ListNode(0,null);
        ListNode head = op;
        int remainder = 0;
        while(l1!=null || l2!=null){
            int v = remainder;
            if(l1!=null){
                v = v+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                v = v+l2.val;
                l2=l2.next;
            }
            
            int nodev = v%10;
            remainder = v/10;
            op.next = new ListNode(nodev, null);
            op=op.next;
        }
        if(remainder!=0){
            op.next = new ListNode(remainder, null);
        }
        return head.next;
    }
}
