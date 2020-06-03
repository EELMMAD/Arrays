package se.lexicon.elmira;

import java.util.Arrays;

public class Ex08 {

    public static void main(String[] args) {
        int[] temArray;
        int[] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        System.out.println("Array: " + Arrays.toString(array));

        array = removeDuplicateElements(array);
        System.out.print("Array without duplication: " + Arrays.toString(array));
    }

    private static int[] removeDuplicateElements(int[] array) {
        int[] tempArray = new int[array.length];
        Arrays.sort(array);

        int index = 0;  // what position to add the arrays in new array
        int length = 0; //length of the array without duplication

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i] == array[i - 1]) {

                } else {
                    tempArray[index] = array[i];
                    index++;
                    length++;
                }
            } else {
                tempArray[index] = array[i];
                index++;
                length++;
            }
        }

        int[] withoutDuplicates = new int[length];
        for (int i = 0; i < withoutDuplicates.length; i++) {
            withoutDuplicates[i] = tempArray[i];
        }
        return withoutDuplicates;
    }
}