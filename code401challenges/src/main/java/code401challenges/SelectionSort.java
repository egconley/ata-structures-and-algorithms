package code401challenges;

public class SelectionSort {
    public void swap(int[] array, int firstIdx, int secondIdx) {
        int temp = array[firstIdx];
        array[firstIdx] = array[secondIdx];
        array[secondIdx] = temp;
    }

    public int getMinIdx(int[] array, int referenceIdx) {
        int minValue = array[referenceIdx];
        int minIdx = referenceIdx;

        // loop over values in array, starting to the right of the reference index
        for (int i=minIdx+1; i<array.length; i++) {
            if (array[i] < minValue) {
                // if an item less than the reference value is found, update minIdx and minValue
                minIdx = i;
                minValue = array[i];
            }
        }
        return minIdx;
    }

    public void selectionSort(int[] array) {
        int startIdx = 0;
        while (startIdx < array.length) {
            int minIdx = getMinIdx(array, startIdx);
            swap(array, startIdx, minIdx);
            startIdx++;
        }
    }
}
