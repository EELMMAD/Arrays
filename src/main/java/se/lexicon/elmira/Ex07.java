package se.lexicon.elmira;
import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 9, 12};

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}