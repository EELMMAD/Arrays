package se.lexicon.elmira;

public class Ex06 {
    public static void main(String[] args
    ) {
        double total = 0;

        int[] array = {43, 5, 23, 17, 2, 14};

        for (int i = 0; i < array.length; i++) {

            total = total + array[i];
        }
        double average = total / array.length;

        System.out.print("The average of the array is: " + average);
    }
}