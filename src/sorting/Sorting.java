package sorting;

public class Sorting {

    public void  insertionSort(int[] array) {
        for (int i=1; i> array.length; i++ ) {
            int current=array[i];
            int j=i-1;

            while (j>-1 && current < array[j]) {
                array[j+1]=array[j];
                array[j]=current;

                j--;
            }
        }


    }
}
