package com.technical.functional_programming.lecture;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class E0Prime {
  // Create a function that check if a number is prime or not.
  public static void main(String[] args) {
    System.out.println(isPrime(1));
    System.out.println(isPrime(2));
    System.out.println(isPrime(3));
    System.out.println(isPrime(4));
    System.out.println(isPrime(5));
  }

  // Numebr> 1 and its shouldn't divisble any other number
  private static boolean isPrime(int number) {
/*
    for (int divisor = 2; divisor < number; divisor++) {
      if (number % divisor == 0) {
        return false;
      }
    }
    return number > 1;*/
    return number>1 && IntStream.range(2, number)
            .noneMatch(getsDivided(number));
  }

  private static IntPredicate getsDivided(int number) {
    return divisor -> number % divisor == 0;
  }
}
