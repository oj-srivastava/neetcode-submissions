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

    public void printList(ListNode head){
        ListNode prhead = head;
        System.out.println("Printing");
        while(prhead!= null){
            System.out.println(prhead.val);
            prhead = prhead.next;
        }
    }

    public void reorderList(ListNode head) {
        if(head==null){
            return ;
        }
        ListNode tail = head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        if(len==1){
            return ;
        }
        int mid = 1;
        ListNode second = head;
        while(mid<=(len/2)){
            second=second.next;
            mid++;
        }
        
        ListNode first = head;
        ListNode middle = second;
        second = second.next;
        middle.next = null;
        // Reverse second
        ListNode prev = null, curr = second;
        while(curr != null){
            ListNode next= curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        second=prev;
        printList(second);
        printList(first);

        while(first != null && second != null){
            ListNode temp2 = second.next, temp1 = first.next;
            first.next = second;
            first = temp1;
            second.next = first;
            second = temp2;
        }
        printList(head);

    }
}
