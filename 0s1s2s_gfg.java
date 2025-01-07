class Solution {
    static class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        Node n0 = null;
        Node n1 = null;
        Node n2 = null;
        
        Node curr = head;
        Node curr0 = head;
        Node curr1 = head;
        while(curr != null) {
            if(curr.data == 0) curr0 = insert(curr, n0);
            else if(curr.data == 1) curr1 = insert(curr, n1);
            else insert(curr, n2);
        }
        curr0.next = n1;
        curr1.next = n2;
        return n0;
    }
    
    static Node insert(Node n, Node num) {
        if(num == null) {
            num = n;
        } else num.next = n;

        return n;
    }
}