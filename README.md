# Code Challenges

I built an app with a direct and powerful purpose. It does all of the things that it accomplishes well. I should describe the purpose and functionality so those that visiters to my README understand the app

### Author: Ellen Conley

## Table of Contents
- Code Challenge 01: Reverse an array
- Code Challenge 02: Insert and shift an array in middle at index
- Code Challenge 03: Binary search in a sorted 1D array

## Code 401 Challenges

### Code Challenge 01

# Challenge Summary
Reverse an array.

## Challenge Description
Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.

## Approach & Efficiency


## Solution
![](./code401challenges/src/main/java/code401challenges/assets/code401challenge01.jpeg)

* [submission PR 1](https://github.com/egconley/data-structures-and-algorithms/pull/35)
* [submission PR 2](https://github.com/egconley/data-structures-and-algorithms/pull/35)

### Code Challenge 02

# Challenge Summary
Insert and shift an array in middle at index

## Challenge Description
Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

## Approach & Efficiency

1. Create a new int array of length +1
2. Loop over new int array, inserting values from input array until i is half the length of the input array.
  - if the input array is an even-length array, insert input value at i.  Continue inserting values from input array[i-1] at i of new array.
  - if the input array is an odd-length array, insert value from old array at i, AND insert the input value at i+1.  At indexes greater than i+1, insert values from input array[i-1]
    
## Solution
![](./code401challenges/src/main/java/code401challenges/assets/code401challenge02.jpg)

* [submission PR 1](https://github.com/egconley/data-structures-and-algorithms/pull/39)

```
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
```

### Code Challenge 03

# Challenge Summary
Binary search in a sorted 1D array

## Challenge Description
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

## Approach & Efficiency

...will come back and update!
    
## Solution
![](./code401challenges/src/main/java/code401challenges/assets/array-binary-search.jpg)

* [submission PR 1](https://github.com/egconley/data-structures-and-algorithms/pull/41)
* [resubmission PR]()

```
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
```
