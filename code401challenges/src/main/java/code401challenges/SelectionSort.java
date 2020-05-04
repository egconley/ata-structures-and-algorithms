package code401challenges;

public class SelectionSort {

    public int[] selectionSort(int[] arr){

        for (int i=0; i<arr.length; i++) {
            int head = arr[i];
            for (int j=i; j<arr.length; j++) {
                if (arr[j]<=head) {
                    head = arr[j];
                    arr[j] = arr[i];
                    arr[i] = head;
                }
            }
        }
        return arr;
    }
}
