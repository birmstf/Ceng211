package quickSummary;

public class LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    Node head;

    // LISTELEME
    public void printList() {
        Node t = head;
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }

    // SEARCH
    public boolean search(int x) {
        Node t = head;
        while (t != null) {
            if (t.data == x) return true;
            t = t.next;
        }
        return false;
    }

    // ADD FIRST
    public void addFirst(int x) {
        Node n = new Node(x);
        n.next = head;
        head = n;
    }

    // ADD LAST
    public void addLast(int x) {
        Node n = new Node(x);
        if (head == null) {
            head = n;
            return;
        }
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }

        t.next = n;
    }

    // DELETE
    public void delete(int x) {
        if (head == null) return;

        // head silinecekse
        if (head.data == x) {
            head = head.next;
            return;
        }

        Node t = head;
        while (t.next != null && t.next.data != x)
            t = t.next;

        if (t.next != null)
            t.next = t.next.next;
    }
}
