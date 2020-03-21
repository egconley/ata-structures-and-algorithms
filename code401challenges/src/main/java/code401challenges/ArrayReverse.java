package code401challenges;

public class ArrayReverse {
  public static int[] reverseArray(int[] inputArray) {
    int[] outputArray = new int[inputArray.length];
    for (int i=0; i<inputArray.length; i++) {
        int newPosition = Math.abs(i - (inputArray.length - 1));
        int item = inputArray[ newPosition ];
        outputArray[i] = item;
      }
    return outputArray; 
  }
}