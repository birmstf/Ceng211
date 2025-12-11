package hashRsa;

public class TestInHashTableStudent {

    public static void main(String[] args) {

        InHashTableStudent ht = new InHashTableStudent();

        ht.set(10, "Ali", 75.5);
        ht.set(3, "Ayşe", 82.0);
        ht.set(17, "Mehmet", 60.0);   // 17 → aynı bucket'a düşer (10 ile)
        ht.set(3, "Ayşe Yılmaz", 90.0);  // Güncelleme

        ht.printTable();

        System.out.println("\nGET 10 → " + ht.get(10));
        System.out.println("GET 3 → " + ht.get(3));
        System.out.println("GET 99 → " + ht.get(99));  // yok

        System.out.println("\nAverage grade = " + ht.getAverageGrade());
    }
}
