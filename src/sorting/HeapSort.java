package sorting;

public class HeapSort {

    // Ana Heap Sort fonksiyonu
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 1️⃣ Max Heap oluştur
        // Son iç düğümden (n/2 - 1) başlayarak heapify
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 2️⃣ En büyük elemanı sona at, heap'i küçült
        for (int i = n - 1; i > 0; i--) {
            // root (en büyük) ile son elemanı değiştir
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Kalan heap için heapify
            heapify(arr, i, 0);
        }
    }

    // Heapify (aşağı süzme)
    static void heapify(int[] arr, int heapSize, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        // Sol çocuk daha büyük mü?
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        // Sağ çocuk daha büyük mü?
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        // Eğer root en büyük değilse
        if (largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            // Değişiklikten sonra aşağı doğru devam et
            heapify(arr, heapSize, largest);
        }
    }

    // Test
    public static void main(String[] args) {
        int[] arr = {45, 100, 135, 55, 60};

        heapSort(arr);

        System.out.println("Sorted array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
