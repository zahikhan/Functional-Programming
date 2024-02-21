package com.technical.functional_programming.lecture;

import java.util.List;
import java.util.function.Predicate;

public class E6LambdaSumOfIntegers {
  // Req: Create a function that sums integers based on condition.
  public static void main(String[] args) {
    final List<Integer> values = List.of(1, 2, 3, 4, 5, 6);
    System.out.println(sum(values,x->true));
    System.out.println(sum(values, x-> x%2==0));

    System.out.println(sum(values, x->x>3&& x>0));
  }

  static int sum(List<Integer> values, Predicate<Integer> condition) {
    int sum = 0;
    for (int e : values) {
      if(condition.test(e))
      sum += e;
    }
    return sum;
  }
}
