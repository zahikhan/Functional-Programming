package com.technical.functional_programming.lecture;

import java.util.stream.IntStream;

public class E3LazyEvaluationUsingIntStream {
    //Show the stream with the lazy evaluation gen upto 10k integers lazily.
    public static void main(String[] args){

//        for (int loop =0; loop<1000; loop++)

        IntStream.range(1,1000)
                .peek(x->System.out.println(x))
                .filter(e->e>1)
                .mapToObj(x->String.valueOf(x))
                .peek(System.out::print)
                .findFirst();
    }
}
