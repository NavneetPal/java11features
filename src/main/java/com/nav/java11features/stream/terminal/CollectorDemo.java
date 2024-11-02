package com.nav.java11features.stream.terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorDemo {

    public static void main(String[] args){
        //Group By string of equal Length
        List<String> empNames = List.of("Ram","Roy","Nakul","Megha");
        Map<Integer, List<String>> nameMap = empNames.stream()
                .collect(Collectors.groupingBy(name -> name.length()));
        System.out.println(nameMap);

        //Join each element from the list of string
        String word = empNames.stream().collect(Collectors.joining(","));
        System.out.println(word);
    }
}
