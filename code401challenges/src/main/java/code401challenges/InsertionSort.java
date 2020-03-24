package code401challenges;

public class InsertionSort {

    public void insert(int[] array, int rightIdx, int value) {
        int j;
        for (j=rightIdx; j>=0 && array[j]>value; j--) {
            array[j+1] = array[j];
        }
        array[j+1] = value;
    }

    public void insertionSort(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            insert(array, i, array[i+1]);
        }
    }
}
