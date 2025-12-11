package hashRsa;

public class InHashTableStudent {

    public static class Node {
        int id;
        String name;
        double grade;
        Node next;

        public Node(int id, String name, double grade, Node next) {
            this.id = id;
            this.name = name;
            this.grade = grade;
            this.next = next;
        }
    }

    private Node[] table;

    public InHashTableStudent() {
        table = new Node[7];
    }

    private int hash(int id) {
        return Math.abs(id) % table.length;
    }


    // ============================
    //          SET METHOD
    // ============================
    public void set(int id, String name, double grade) {
        int index = hash(id);
        Node head = table[index];

        if (head == null) {
            table[index] = new Node(id, name, grade, null);
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.id == id) { // güncelle
                current.name = name;
                current.grade = grade;
                return;
            }
            prev = current;
            current = current.next;
        }

        // sona ekle
        prev.next = new Node(id, name, grade, null);
    }


    // ============================
    //          GET METHOD
    // ============================
    public String get(int id) {
        int index = hash(id);
        Node current = table[index];

        while (current != null) {
            if (current.id == id) {
                return "ID=" + current.id +
                        ", Name=" + current.name +
                        ", Grade=" + current.grade;
            }
            current = current.next;
        }

        return null;  // bulunamadı
    }



    // ============================
    //   AVERAGE GRADE METHOD
    // ============================
    public double getAverageGrade() {
        double total = 0;
        int count = 0;

        for (int i = 0; i < table.length; i++) {
            Node current = table[i];

            while (current != null) {
                total += current.grade;
                count++;
                current = current.next;
            }
        }

        if (count == 0) return 0.0;
        return total / count;
    }



    // ============================
    //      PRINT TABLE METHOD
    // ============================
    public void printTable() {
        System.out.println("=== Hash Table Nodes ===");
        for (int i = 0; i < table.length; i++) {
            System.out.print("Table Node " + i + ": ");

            Node current = table[i];
            if (current == null) {
                System.out.println("empty");
            } else {
                while (current != null) {
                    System.out.print("[ID=" + current.id +
                            ", Name=" + current.name +
                            ", Grade=" + current.grade + "] -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }
        System.out.println("==========================");
    }
}
