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
       Collections.sort(randomNumbers, Collections.reverseOrder());
       System.out.println("The random numbers in reverse order are: " + randomNumbers);


       System.out.println("------------------------------------------");


         }
    }
