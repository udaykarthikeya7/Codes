public class linked_list {
 
    static class LinkedListNode {
        public int data;
        public LinkedListNode next;
 
        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }  
 
    private static void printLinkedList(LinkedListNode head) {
        //Below code is responsibile for printing a linked list
        LinkedListNode curr = head;
        while (curr != null) {
          System.out.print(curr.data + " ---> ");
          curr = curr.next;
        }
        System.out.println();
    }
 
 
    private static LinkedListNode insertNodeAtTail(LinkedListNode head, int val) {
        LinkedListNode newlyCreatedNode = new LinkedListNode(val);
        if (head == null) {
            return newlyCreatedNode;
        }
 
        LinkedListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        // tail pointing to tail 
        tail.next = newlyCreatedNode;
        return head;
    }
 
    private static LinkedListNode deleteTailNode(LinkedListNode head) {
        // This function takes the head node of a linked list 
        // and deletes the tail node, then returns back the head node
 
        if (head == null || head.next == null) {
            return null;
        }
 
        LinkedListNode tail = head;
        LinkedListNode secondLast = null;
 
        while (tail.next != null) {
            secondLast = tail;
            tail = tail.next;
        }
        secondLast.next = null;
        return head;
 
    }
 
 
    private static LinkedListNode deleteHeadNode(LinkedListNode head) {
 
        if (head == null) {
            return null;
        }
 
        LinkedListNode secondNode = head.next;
        head.next = null;
        return secondNode;
    }
 
    private static LinkedListNode deleteNodeAtSpecificPosition(LinkedListNode head, int index) {
 
        int currentIndex = 0;
        LinkedListNode curr = head;
 
 
        while(currentIndex != (index - 1)) {
            curr = curr.next;
            currentIndex++;
        }
 
        LinkedListNode previous = curr;
        curr = curr.next;
        previous.next = curr.next;
        return head;
 
    }
 
 
    public static void main(String[] args) {
 
 
        int[] arr = {111, 12, 45, 34, 78, 56};
        LinkedListNode head = null;
 
        for (int ele: arr) {
            head = insertNodeAtTail(head, ele);
        }
 
      printLinkedList(head);
      head = deleteNodeAtSpecificPosition(head, 3);
      printLinkedList(head);
 
      head = deleteNodeAtSpecificPosition(head, 2);
      printLinkedList(head);
 
 
 
    }
}
