package se.lexicon.elmira;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] array1 = {1, 15, 20};
        int[] array2 = Arrays.copyOf(array1, 3);

        System.out.println("Elements of first array: " + Arrays.toString(array1));
        System.out.println("Elements of second array: " + Arrays.toString(array2));
    }
}