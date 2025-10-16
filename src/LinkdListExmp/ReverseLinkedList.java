package LinkdListExmp;

public class ReverseLinkedList {
    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // sonraki düğümü kaydet
            current.next = prev;   // bağlantıyı ters çevir
            prev = current;        // bir ileri kay
            current = next;
        }

        return prev; // yeni baş
    }


}