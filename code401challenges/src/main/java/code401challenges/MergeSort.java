package code401challenges;

import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] arr) {

        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        if (n>1) {
            int mid = n/2;

            int[] left = new int[n-mid];
            int[] right = new int[n-left.length];
            for (int i=0; i<n; i++) {
                if (i<left.length) {
                    left[i] = arr[i];
                } else {
                    right[i-left.length] = arr[i];
                }
            }
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }
        return arr;
    }

    public int[] merge(int[] left, int[] right, int[] arr) {

        int i=0;
        int j=0;
        int k=0;

        while (i<left.length && j<right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i=i+1;
            } else {
                arr[k] = right[j];
                j=j+1;
            }
            System.out.println("while - " + Arrays.toString(arr));
            k=k+1;
        }

        if (i==left.length) {
            while (k<arr.length) {
                arr[k] = right[j];
                k++;
                j++;
            }
        } else {
            while(k<arr.length) {
                arr[k] = left[i];
                k++;
                i++;
            }
        }

        return arr;
    }
}
