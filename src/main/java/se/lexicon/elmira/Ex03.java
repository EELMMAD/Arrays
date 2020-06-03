package se.lexicon.elmira;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        String[] cities = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(cities);
        System.out.print(Arrays.toString(cities));  //Attention to Array.toString()----- Array == object
    }
}
