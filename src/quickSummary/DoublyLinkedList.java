package quickSummary;

public class DoublyLinkedList {

    static class DNode {
        int data;
        DNode prev, next;

        DNode(int d) {
            data = d;
        }
    }

    DNode head;

    public void printList() {
        DNode t = head;
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }


    public boolean search(int x) {
        DNode t = head;
        while (t != null) {
            if (t.data == x) return true;
            t = t.next;
        }
        return false;
    }

    public void addFirst(int x) {
        DNode n = new DNode(x);
        n.next = head;
        if (head != null) head.prev = n;
        head = n;
    }

    public void addLast(int x) {
        DNode n = new DNode(x);
        if (head == null) {
            head = n;
            return;
        }

        DNode t = head;
        while (t.next != null)
            t = t.next;

        t.next = n;
        n.prev = t;
    }

    public void delete(int x) {
        if (head == null) return;

        if (head.data == x) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }

        DNode t = head;
        while (t != null && t.data != x)
            t = t.next;

        if (t == null) return;

        if (t.prev != null) t.prev.next = t.next;
        if (t.next != null) t.next.prev = t.prev;
    }
}
