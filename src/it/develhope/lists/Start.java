package it.develhope.lists;

import java.util.*;
import java.util.stream.Collectors;

public class Start {
    public static void main(String[] args) {

       System.out.println("---------------Starting------------------");

       Integer[] s1 = new Integer[]{1, 2, 4, 13, 26, 52};
       List<Integer> divisorsOf52 = Arrays.asList(s1);
       System.out.println("These are the divisors of 52: " + divisorsOf52);

       List<Integer> randomNumbers = new ArrayList<>();
       randomNumbers.add(1);
       randomNumbers.add(60);
       randomNumbers.add(13);
       randomNumbers.add(12);
       System.out.println("This is the random numbers' list: " + randomNumbers);
       randomNumbers.addAll(divisorsOf52);
       System.out.println("This is the updated random numbers' list: " + randomNumbers);
       System.out.println("This list has " + randomNumbers.size() + " items");

       randomNumbers = randomNumbers.stream().distinct().collect(Collectors.toList());
       //FIXME write again the line above using an iterator
       System.out.println("This is random numbers' list without duplicates: " + randomNumbers);
       System.out.println("This new list has " + randomNumbers.size() + " items");
       Collections.sort(randomNumbers);
       //TODO complete these task using Collections.sort() in descending order,
       // using Collections.reverseOrder() as a comparator for the Collections.sort() method
       // understand what's a comparator and how it works
       System.out.println(randomNumbers);


       System.out.println("------------------------------------------");


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