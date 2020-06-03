package se.lexicon.elmira;

public class Ex02 {
    public static void main(String[] args) {
        indexOf();
    }

    public static int indexOf() {
        String numbers = "3658";

        int index = numbers.indexOf("5");
        int index1 = numbers.indexOf("9");
        System.out.println("Index position of number 5 is: " + index);
        System.out.println("The element does not exist.  " + index1);
        return -1;
    }
}