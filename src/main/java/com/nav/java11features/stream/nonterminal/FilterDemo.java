package com.nav.java11features.stream.nonterminal;

import java.util.List;

public class FilterDemo {

    public static void main(String args[]){
            List<Integer> ls = List.of(1,2,3,4,5,6,7,8,9,10);
            List<Integer> filteredNumbers = ls.stream()
                    .filter(n -> n%2==0)
                    .toList();

            filteredNumbers.forEach(System.out::println);
    }
}
