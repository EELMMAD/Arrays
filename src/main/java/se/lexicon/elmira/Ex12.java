
package se.lexicon.elmira;

import java.util.Arrays;

public class Ex12 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        int[] diagonalNumbers = new int[numbers.length];
        int numberY;
        int numberX = 0;
        for(int x = 0; x < numbers.length; x++ ){
            numberY = 1;
            numberX++;
            for(int y = 0; y < numbers.length; y++){
                numbers[x][y] = numberY++ * numberX;
                System.out.print(numbers[x][y] + " ");
                if (y == numbers[x].length -1){
                    System.out.println();
                }
            }
            diagonalNumbers[x] = numbers[x][x];
        }
        System.out.println("Diagonal numbers are: " + Arrays.toString(diagonalNumbers));
    }
}





