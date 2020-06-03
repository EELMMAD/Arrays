package se.lexicon.elmira;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the size of array:  ");
        int n = input.nextInt();

        //Declare an array
        int array[] = new int[n];

        System.out.println("Enter an array values: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int temp;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        System.out.println("Printing an array after reverse: ");

        for (int j = 0; j < n; j++) {
            System.out.println(array[j]);
        }
    }
}
