/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        Map<Node, Node> oldToNewMap = new HashMap<>();
        while(temp!=null){
            Node newNode = new Node(temp.val);
            oldToNewMap.put(temp, newNode);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            Node newNode = oldToNewMap.get(temp);
            newNode.next = oldToNewMap.get(temp.next);
            newNode.random = oldToNewMap.get(temp.random);
            temp = temp.next;
        }

        return oldToNewMap.get(head);
    }
}
