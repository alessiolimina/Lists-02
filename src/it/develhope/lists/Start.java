package it.develhope.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
       Integer[] s1 = new Integer[]{1,2,4,13,26,52};
       List<Integer> divisorsOf52 = Arrays.asList(s1);
       System.out.println(divisorsOf52);

       List<Integer> randomNumbers= new ArrayList<>();
       randomNumbers.add(1);
       randomNumbers.add(60);
       randomNumbers.add(13);
       randomNumbers.add(12);
       System.out.println(randomNumbers);
       randomNumbers.addAll(divisorsOf52);
       System.out.println(randomNumbers);
       System.out.println(randomNumbers.size());




    }
}
/*
define a testing class with a main() method where you:
define a List of integers called divisorsOf52 that contains all the divisors of 52
define a List of integers called randomNumbers that contains the following numbers: 1, 60, 13, 12
use a specific method of List for appending all the elements of divisorsOf52 at the bottom of randomNumbers
print the elements of randomNumbers and the number of items inside randomNumbers
find the positions of the duplicates and remove them, leaving just 1 occurrence of a specific integer
print again the elements of randomNumbers and the number of items inside randomNumbers
sort randomNumbers in descending order using Collections.sort()
print again the elements of randomNumbers
 */



// use the .addAll() method to append all the List at the bottom


// find the positions of the duplicates and remove the first occurrence


// use Collections.reverseOrder() as a comparator for the Collections.sort() method