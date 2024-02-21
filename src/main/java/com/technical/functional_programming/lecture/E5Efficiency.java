package com.technical.functional_programming.lecture;

import java.util.List;
import java.util.Optional;

public class E5Efficiency {
  //FIND THE NUMBER GREATER THAN 4 AND EVEN, DOUBLE IT AND PRINT IT USING IMPERATIVE AND DECLARATIVE STYLE.
  public static void main(String[] args) {
    final List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);


    // 1. FUnctional Composition => Cuteness
    //2 . Lazy Evaluation.
    //3. We have guarntee our effeciency is atleast as much as we have in the imperative style.

    int value = 0;
    for(int x: integers){
      if(x>4 && x%2==0){
        value = x*2 ;
        break;
      }
    }

    final Optional<Integer> first = integers.stream()
            .filter(E5Efficiency::isGreaterThan4)
            .filter(E5Efficiency::isEven)
            .map(E5Efficiency::doubleIt)
            .findFirst();

  }

  static int doubleIt(int x){
    System.out.println("Double is called " + x );
    return x * 2;
  }

  static boolean isEven(int n){
    System.out.println("Even is called " + n );
    return n % 2 == 0;
  }

  static boolean isGreaterThan4(int n){
    System.out.println("Greater is called " + n );
    return n>4;
  }




}
