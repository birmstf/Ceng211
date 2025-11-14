package quickSummary;

public class testQuickSummary {


        public static void main(String[] args) {

            /* ==========
              SINGLY LINKED LIST */
            System.out.println("=== Singly Linked List Test ===");

            LinkedList sList = new LinkedList();

            sList.addFirst(10);
            sList.addFirst(5);
            sList.addLast(20);
            sList.addLast(30);

            System.out.println("Liste:");
            sList.printList();

            System.out.println("Search 20 -> " + sList.search(20));
            System.out.println("Search 99 -> " + sList.search(99));

            sList.delete(20);
            System.out.println("After delete 20:");
            sList.printList();


        /* ===============================
           2) DOUBLY LINKED LIST TEST
        =============================== */
            System.out.println("\n=== Doubly Linked List Test ===");

            DoublyLinkedList dList = new DoublyLinkedList();

            dList.addFirst(50);
            dList.addFirst(40);
            dList.addLast(60);
            dList.addLast(70);

            System.out.println("Liste:");
            dList.printList();

            System.out.println("Search 60 -> " + dList.search(60));
            System.out.println("Search 999 -> " + dList.search(999));

            dList.delete(60);
            System.out.println("After delete 60:");
            dList.printList();


        /* ===============================
           3) QUEUE TEST
        =============================== */
            System.out.println("\n=== Queue Test ===");

            MyQueue queue = new MyQueue();

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);

            System.out.println("Queue:");
            queue.printQueue();

            System.out.println("Peek -> " + queue.peek());
            System.out.println("Dequeue -> " + queue.dequeue());
            System.out.println("After dequeue:");
            queue.printQueue();

            System.out.println("Is Empty -> " + queue.isEmpty());
            queue.dequeue();
            queue.dequeue(); // hepsi biter
            System.out.println("Is Empty (after all removed) -> " + queue.isEmpty());
        }


}
