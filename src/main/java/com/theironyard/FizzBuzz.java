package com.theironyard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * For this exercise you will be making a class with one static method that is a
 * variation on the classic FizzBuzz exercises. Follow the instructions below.
 */


public class FizzBuzz {

    /**
     * Create a static method named asMap(). This method implements a variation
     * on the classic FizzBuzz exercise. The method should accept an int
     * argument named `max`. The method will iterate from 1 to max (inclusive)
     * and create a HashMap that is keyed by Strings and contains values that
     * are Arrays of Integers.
     * <p>
     * The HashMap returned will have three keys:
     * <p>
     * fizz - This is an Array of integers in the range 1 to `max` inclusive
     * that are divisible by 3 (but not 5). EG: 3, 6, 9, etc.
     * <p>
     * buzz - This is an Array of integers in the range 1 to `max` inclusive
     * that are divisible by 5 (but not 3). EG: 5, 10, 20, etc.
     * <p>
     * fizzbuzz - This is an Array of integers in the range 1 to `max` inclusive
     * that are divisible by both 3 and 5. EG: 15, 30, 45, etc.
     * <p>
     * All other numbers are disregarded.
     * <p>
     * So, if the `max` argument provided is 45, this method will return a
     * HashMap that looks like this:
     * <p>
     * {
     * fizz -> [3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42],
     * buzz -> [5, 10, 20, 25, 35, 40],
     * fizzbuzz -> [15, 30, 45]
     * }
     *
     * @param max The maximum number to iterate to when generating the HashMap
     * @return A HashMap of Strings mapped to an Array of Integers containing keys and values for fizz, buzz, and fizzbuzz
     */


    public static HashMap<String, ArrayList<Integer>> asMap(int max) {
        HashMap<String, ArrayList<Integer>> deathByFizz = new HashMap<>();

        ArrayList<Integer> i1 = new ArrayList<>();
        ArrayList<Integer> i2 = new ArrayList<>();
        ArrayList<Integer> i3 = new ArrayList<>();


       /* String fizz = new String();
        String buzz = new String();
        String fizzbuzz = new String();
*/
        for (int i = 1; i <= max; i++){



            if (i % 15 == 0) {
                i3.add(i);
            }else if (i % 5 == 0) {
                i2.add(i);
            }else if (i % 3 == 0) {
                i1.add(i);
            }

        }

        deathByFizz.put("fizz", i1);
        deathByFizz.put("buzz", i2);
        deathByFizz.put("fizzbuzz", i3);

        return deathByFizz;

    }


}










/*

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(String.valueOf(i));
            }
        }
    }
}
*/