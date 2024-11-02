package com.nav.java11features.stream.nonterminal;

import com.nav.java11features.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args){
        Employee e1 = new Employee(1,"Navneet","BE",20000,null);
        Employee e2 = new Employee(2,"Nakul","BE",25000,null);
        Employee e3 = new Employee(3,"Nikhil","BE",22000,null);

        List<Employee> empList = List.of(e1,e2,e3);

        List<String> empNames = empList.stream()
                .map(emp -> emp.getEName())
                .collect(Collectors.toList());
        System.out.println(empNames);
    }
}
