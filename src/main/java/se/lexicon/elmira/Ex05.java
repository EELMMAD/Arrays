package se.lexicon.elmira;

public class Ex05 {
    public static void main(String[] args){
        String stringArray[][] = new String[2][2];          //[row][column]
        stringArray[0][0] = "France ";
        stringArray[0][1] = "Paris ";
        stringArray[1][0] = "Sweden ";
        stringArray[1][1] = "Stockholm ";

        System.out.print(stringArray[0][0]);
        System.out.println(stringArray[0][1]);
        System.out.print(stringArray[1][0]);
        System.out.println(stringArray[1][1]);
    }
}
