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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headNew = null;
        ListNode head = null;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val){
                ListNode temp = list1.next;
                if(headNew != null){
                    headNew.next = list1;
                    headNew = list1;
                } else {
                    headNew = list1;
                    head = list1;
                }
                headNew.next = null;
                list1 = temp;
            } else {
                ListNode temp = list2.next;
                if(headNew != null){
                    headNew.next = list2;
                    headNew = list2;
                } else{ 
                    headNew = list2;
                    head = list2;
                }
                headNew.next = null;
                list2 = temp;
            }
        }
        if(list1 != null){
            if(headNew != null){
                headNew.next = list1;
            } else {
                head = list1;
            }
        } else if (list2 != null){
            if(headNew != null){
                headNew.next = list2;
            } else {
                head = list2;
            }
        }
        return head;
    }
}