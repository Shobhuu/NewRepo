package com.example.demo.work;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumberStreamApi {

    public static void main(String args[]){

        List<Integer> list = List.of(2,4,2,7,9,14,4,20);

        Stream<Integer> listStream = list.stream();
        List<Integer> evenList = listStream.filter(i->i%2==0).sorted().collect(Collectors.toList());

        System.out.println(evenList);

    }
}
