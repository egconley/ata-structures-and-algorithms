package code401challenges;

import java.util.Arrays;

public class BinarySearch {

    public static boolean binarySearchBoolean(int[] arr, int n) {
        if (arr == null || arr.length == 0) {
            return false;
        } else {

            int leftIdx = 0;
            int rightIdx = arr.length - 1;
            int mpIdx = (rightIdx + leftIdx) / 2;
            int mpValue = arr[mpIdx];

            boolean found = false;

            while (!found && leftIdx <= rightIdx) {
                mpValue = arr[mpIdx];
                found = (mpValue == n || (arr[leftIdx] == n) || (arr[rightIdx] == n));
                if (mpValue > n) {
                    rightIdx = --mpIdx;
                } else if (mpValue < n) {
                    leftIdx = ++mpIdx;
                }
            }
            return found;
        }
    }

    // returns index for n if n exists in arr, otherwise returns -1
    public static int binarySearch(int[] arr, int n) {
        if (arr == null || arr.length == 0) {
            return -1;
        } else {

            int leftIdx = 0;
            int rightIdx = arr.length - 1;
            int mpIdx = (rightIdx + leftIdx) / 2;
            int mpValue = arr[mpIdx];

            boolean found = (mpValue == n || (arr[leftIdx] == n) || (arr[rightIdx] == n));
            int nIdx = -1;

            if (mpValue==n) {
                nIdx = mpIdx;
            } else if (arr[rightIdx]==n) {
                nIdx = rightIdx;
            } else if (arr[leftIdx]==n) {
                nIdx = leftIdx;
            }

            while (!found && leftIdx != mpIdx && rightIdx != mpIdx) {
                if (mpValue > n) {
                    rightIdx = --mpIdx;

                } else if (mpValue < n) {
                    leftIdx = ++mpIdx;
                }

                mpIdx = (rightIdx + leftIdx) / 2;
                mpValue = arr[mpIdx];
                found = (mpValue == n || (arr[leftIdx] == n) || (arr[rightIdx] == n));

                if (mpValue==n) {
                    nIdx = mpIdx;
                } else if (arr[rightIdx]==n) {
                    nIdx = rightIdx;
                } else if (arr[leftIdx]==n) {
                    nIdx = leftIdx;
                }
            }
            return nIdx;
        }
    }
}
