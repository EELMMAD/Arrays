package se.lexicon.elmira;

import java.util.Arrays;

public class Ex09 {
    public static void main (String[] args) {
        int[] firstArray = {2, 4, 6, 8};
        int[] arrayToAdd = {1, 3, 5, 7};

        System.out.println("Arrays: " + Arrays.toString(firstArray));

        for (int i = 0; i < arrayToAdd.length; i++) {
            firstArray = addElementsToFirstArray(firstArray, arrayToAdd[i]);
        }
        System.out.println("Expanded array: " + Arrays.toString(firstArray));
    }
    static int[] addElementsToFirstArray(int[] numbers, int number){
        int[] newNumbers = Arrays.copyOf(numbers, numbers.length + 1);
        newNumbers[newNumbers.length - 1] = number;
        return newNumbers;
    }
}

