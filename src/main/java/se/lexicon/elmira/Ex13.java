package se.lexicon.elmira;

import java.util.Arrays;
import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {
        Random random = new Random();
        int number =  random.nextInt(20) +1;
        int[] randomNumbers = new int[number];
        int[] sortedNumbers;
        for (int i = 0; i < randomNumbers.length;i++){
            randomNumbers[i] = random.nextInt(100) +1;
            System.out.println(randomNumbers[i] % 2);
        }
        System.out.println("Random generated array: " + Arrays.toString(randomNumbers));
        sortedNumbers = sortArrayByOddAndEven(randomNumbers);
        System.out.println("Array Sorted odd to even: " + Arrays.toString(sortedNumbers));
    }
    static int[] sortArrayByOddAndEven(int[] numbers){
        int[] newNumbers = new int[numbers.length];
        int result; // used to check if number is odd or even.
        int indexBack = numbers.length; // index used when adding even numbers.
        int indexFront = 0;  // index used when adding odd numbers.
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            result = numbers[i] % 2;
            if (result == 0){
                newNumbers[indexBack-1] = numbers[i];
                indexBack--;
            }else if(result == 1){
                newNumbers[indexFront] = numbers[i];
                indexFront++;
            }
        }
        return newNumbers;
    }
}
