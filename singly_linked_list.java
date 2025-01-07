import java.io.IOException;

public class singly_linked_list {
    static class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private static Node insertNodeAtTail(Node head, int val) {
        Node newNode = new Node(val);
        if(head == null) {
            return newNode;
        } else {
            Node tail = head;
            while (tail.next !=  null) {
                tail = tail.next; 
            }

            tail.next = newNode;
            return head;
        }
    }
    private static void printLinkedList(Node head) {
        if(head == null) {
            System.out.println("no Linked list...");
        } else {
            Node curr = head;
            while (curr !=  null) {
                System.out.print(curr.data + (curr.next == null ? "" : " --> "));
                curr = curr.next;
            }
            System.out.println();
        }
    }
    private static Node deleteTailNode(Node head) {
        Node secondLast = null;
        Node last = head;

        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }
        secondLast.next = null;
        return last;
    }
    private static Node deleteHeadNode(Node head) {
        if(head == null) {
            return null;
        }
        Node secondNode = head.next;
        head.next = null;
        return secondNode; 
    }
    private static Node deleteNodeatPosition(Node head, int index) {
        if(head == null) {
            return null;
        }
        Node prev = null;
        Node curr = head;
        int i = index;
        while(i > 0 && curr.next != null) {
            curr = curr.next;
            i--;
        }
        
        prev = curr;
        prev.next = curr.next;
        return curr;
    }
    public static void main(String args[]) throws IOException {
        int[] arr = {111, 231, 102, 567, 456, 678};
        Node head = null;
        for(int i : arr) {
            head = insertNodeAtTail(head, i);
        }

        printLinkedList(head);

        deleteTailNode(head);
        printLinkedList(head);

        head = deleteHeadNode(head);
        printLinkedList(head);

        deleteNodeatPosition(head, 3);
        printLinkedList(head);

    }
}
