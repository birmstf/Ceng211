package LinkdListExmp;

public class ReverseLinkedList {
    static Node reverse(Node head) {
        Node next = null;
        Node current = head;
        Node prev = null;

        while (current != null) {
            next = current.next;   // sonraki düğümü kaydet
            current.next = prev;   // bağlantıyı ters çevir
            prev = current;        // bir ileri kay
            current = next;
        }

        return prev; // yeni baş
    }


}