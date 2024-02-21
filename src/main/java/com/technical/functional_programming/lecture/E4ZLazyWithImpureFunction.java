package com.technical.functional_programming.lecture;

import java.util.List;

public class E4ZLazyWithImpureFunction {
  public static void main(String[] args) {

    int[] x = {2};
    List<Integer> values = List.of(1, 2, 3, 4, 5);

    var stream = values.stream().map(value -> value * x[0]);

    x[0] = 0;

    System.out.println(stream.toList());
  }
}
