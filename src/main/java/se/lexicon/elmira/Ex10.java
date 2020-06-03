package se.lexicon.elmira;

public class Ex10 {
    public static void main(String[] args) {
        int[][] numbers = new int[10][10];

        int row;
        int column = 0;

        for (int x = 0; x < numbers.length; x++) {
            row = 1;
            column++;

            for (int y = 0; y < numbers.length; y++) {
                numbers[x][y] = row++ * column;

                System.out.print(numbers[x][y] + "\t");
                if (y == numbers[x].length - 1) {
                    System.out.println();
                }
            }
        }
    }
}