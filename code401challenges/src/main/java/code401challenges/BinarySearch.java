package code401challenges;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        //int[] testArray = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
        //int testValue = 145;

        //binarySearch(testArray, testValue);
    }

    public static int binarySearch(int[] array, int value) {
        System.out.println("array: " + Arrays.toString(array) + " target value: " + value);
        int startSearchIdx = 0;
        int endSearchIdx = array.length - 1;
        int target_idx = -1;
        int midpoint = (endSearchIdx + startSearchIdx)/2;

        boolean foundValue = false;

        System.out.println("array: " + array + " target value: " + value);

        System.out.println("mp = " + midpoint + " array[mp]: " + array[midpoint] + " target value: " + value);

        while (foundValue == false) {
            if (array[midpoint] == value) {
              System.out.println("#1 array[mp] == value, array[mp] = " + array[midpoint] + " mp: " + midpoint);
              target_idx = midpoint;
              System.out.println("value found! array[target_idx] = " + array[target_idx]);
              foundValue = true;
            } else if (array[startSearchIdx] == value) {
              target_idx = startSearchIdx;
              System.out.println("#2 value found! array[target_idx] = " + array[target_idx]);
              foundValue = true;
            } else if (array[endSearchIdx] == value) {
                target_idx = endSearchIdx;
                System.out.println("#3 value found! array[target_idx] = " + array[target_idx]);
                foundValue = true;
            } else if (value < array[0] || value > array[array.length -1]){
                System.out.println("#4 value doesn't exist in input array");
                break;
            } else if (array[midpoint] > value) {
                System.out.println("#5 array[mp] > value, array[mp] = " + array[midpoint] + " mp: " + midpoint);
                endSearchIdx = midpoint;

                midpoint = (endSearchIdx + startSearchIdx)/2;
                System.out.println("new mp: " + midpoint);
            } else if (array[midpoint] < value) {
                System.out.println("#6 array[mp] < value, array[mp] = " + array[midpoint] + " mp: " + midpoint);
                startSearchIdx = midpoint;

                midpoint = (endSearchIdx + startSearchIdx)/2;
            } else if ( (endSearchIdx - startSearchIdx) < 0 ) {
                System.out.println("#7 value doesn't exist in input array");
                break;
            }
        }
        System.out.println("output target_idx = " + target_idx);
        return target_idx;
    }
}
