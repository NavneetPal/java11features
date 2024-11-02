package com.nav.java11features.stream.nonterminal;

import com.nav.java11features.model.Employee;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatMapDemo {
    public static void main(String[] args){
        Employee e1 = new Employee(1,"Navneet","BE",20000,List.of("Java","SpringBoot","AWS"));
        Employee e2 = new Employee(2,"Nakul","BE",25000,List.of(".NET","C#"));
        Employee e3 = new Employee(3,"Nikhil","BE",22000,List.of("Java","Kotlin"));

        List<Employee> empList = List.of(e1,e2,e3);

        Set<String> empSkills = empList.stream()
                .flatMap(emp -> emp.getESkills().stream())
                .collect(Collectors.toSet());
        System.out.println(empSkills);
    }
}
