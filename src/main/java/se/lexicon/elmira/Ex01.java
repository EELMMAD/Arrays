package se.lexicon.elmira;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] arg) {
        int[] anArray = new int[]{11, 23, 39};
        System.out.println(Arrays.toString(anArray)); // attention to print anArray    //Fetch the value and print because
        // Array is an object and we have to use toString() method to print an object // object is a reference we can not print it in normal way
    }
}
