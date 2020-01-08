package code401challenges;

import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {

        // text case for insertShiftArray()
        int[] testArrayEvenLength = new int[] {1,2,3,4,10,11};
        int[] testArrayOddLength = new int[] {1,2,3,4,10,11,12};
        int testValue1 = 99;
        int testValue2 = 77;
        insertShiftArray(testArrayEvenLength, testValue1);
        insertShiftArray(testArrayOddLength, testValue2);
        System.out.println("testArrayEvenLength: " + Arrays.toString(testArrayEvenLength) + " testValue: " + testValue1);
        System.out.println("testArrayOddLength: " + Arrays.toString(testArrayOddLength) + " testValue: " + testValue2);
    }

    public static int[] insertShiftArray(int[] array, int value) {
        int[] newArray = new int[array.length +1];

        for (int i=0; i < newArray.length; i++) {
            if ( i < (array.length/2) ) {
                newArray[i] = array[i];
            } else if (i == (int) Math.ceil(array.length/2) && array.length %2 == 0) {
                newArray[i] = value;
            } else if (i == (int) Math.ceil(array.length/2) && array.length %2 != 0) {
                newArray[i] = array[i];
                newArray[i+1] = value;
            } else if (i > array.length/2 && array.length %2 == 0) {
                newArray[i] = array[i-1];
            } else if (i > (array.length/2 + 1) && array.length %2 != 0) {
                newArray[i] = array[i-1];
            }
        }
        System.out.println("newArray: " + Arrays.toString(newArray) );
        return newArray;
    }
}