package LinkdListExmp;

public class LinkedList {
    Node head;      // Listenin baş düğümü

    public LinkedList() { //Constructor: LinkedList oluşturulduğunda başlangıçta liste
        head = null;
    }

    // Listenin sonuna düğüm ekleme
    public void append(int data) {
        Node newNode = new Node(data); // Yeni düğüm oluştur
        if (head == null) {  // Liste boş mu?
            head = newNode; // Yeni düğüm baş eleman olur
            return;
        }

        Node current = head;
        while (current.next != null) {   // Listenin sonuna git
            current = current.next;
        }
        current.next = newNode;
    }

    // Listenin başına düğüm ekleme
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Belirli bir düğümü silme
    public void delete(int key) {
        if (head == null) return;

        // Baş düğüm silinecekse
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) return; // Bulunamadı
        prev.next = current.next;
    }

    // Listeyi ekrana yazdırma
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
