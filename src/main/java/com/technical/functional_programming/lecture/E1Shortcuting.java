package com.technical.functional_programming.lecture;

import java.util.function.Supplier;

public class E1Shortcuting {
  public static void main(String[] args) {
    int x = 4;

//    Supplier<Integer> temp = ()->compute(x) ;
    int temp = compute(x);
    if(x>5 && temp<4){
      System.out.println("Path 1 executed");
    }else {
      System.out.println("Part 2 executed.");
    }
  }
  static  int compute(int n){
    System.out.println("compute executed.");
    return n;
  }
}
