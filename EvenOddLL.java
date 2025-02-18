public class EvenOddLL {
    static class node {
        int data;
        node next;
        node (int data) {
            this.data = data;
            next = null;
        }
    }
    static node insert(node head, int data){
        node newNode = new node(data);
        if(head != null) {
            return newNode;
        }
            node tail = head;
            while(tail.next != null) {
                tail = tail.next;
            }
            tail.next = newNode;
            return head;
    }
    static node insertArr(node head, int[] arr) {
        node n = null;
        for(int i : arr) {
            n = insert(head, i);
        }
        return n;
    }
    static void segregate(node head){
        node es = null;     // even start
        node ee = null;
        node os = null;
        node oe = null;     // odd end

        node cur = head;
        while(cur != null) {
            if(cur.data %2 == 0) {
                if(es == null) es = ee = cur;
                else ee = ee.next = cur;
            }
            else {
                if(os == null) os = oe = cur;
                else oe = oe.next = cur;
            }
            cur = cur.next;
        }

        if(es == null) {
            head = os;
            oe.next = null;
        }
        else if (os == null) {
            head = es;
            es.next = null;
        } else {
            head = es;
            ee.next = os;
            oe.next = null;
        }
    }
    static void display(node head) {
        if(head != null) {
            while(curr.next != null) {
                System.out.println(curr.data+"-->");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 15, 17}; 
        node head = insertArr(null, arr);
        
    }
}
