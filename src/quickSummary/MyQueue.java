package quickSummary;

public class MyQueue {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    Node head, tail;

    // LISTELEME
    public void printQueue() {
        Node t = head;
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }
    // ENQUEUE (addLast)
    public void enqueue(int x) {
        Node n = new Node(x);

        if (head == null) {
            head = n;
            tail = n;
            return;
        }

        tail.next = n;
        tail = n;
    }

    // DEQUEUE (removeFirst)
    public int dequeue() {
        if (head == null)
            return -1;

        int val = head.data;
        head = head.next;

        if (head == null)
            tail = null;

        return val;
    }

    // PEEK
    public int peek() {
        if (head == null) return -1;
        return head.data;
    }

    // IS EMPTY
    public boolean isEmpty() {
        return head == null;
    }


}
