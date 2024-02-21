package com.technical.functional_programming.lecture;

import java.util.function.*;

public class E7FunctionInterfaces {
  /*
  * UnaryOperator : WHEN ARGUMENT AND RETURN HAS SAME TYPE.
  * BinaryOperator
  * Predicate
  * Function
  * Supplier
  * Consumer
  * */

//  int function (int argument){}
//  int function(int arg1, int arg2){}
// Predicate
  //Function as the first class citizen.


  // int returnRandom();

  //void initializeDatabase(String dbName){}

  public static void main(String[] args) {

  Predicate<String> isEven = x-> x.length()%2==0;
  boolean isOdd = "avc".length()%2==1;



    System.out.println(isEven.test("Abcd"));
  }
}
