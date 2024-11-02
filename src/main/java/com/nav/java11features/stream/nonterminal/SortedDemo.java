package com.nav.java11features.stream.nonterminal;

import com.nav.java11features.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {

    public static void main(String args[]){

        //Sort function on primitive values
        List<Integer> numbers = List.of(1,2,3,4,5);
        numbers.stream().sorted().forEach(System.out::println);

        List<String> names = List.of("Megha","Neha","Nikita","Ash","Deepika");
        names.stream().sorted().forEach(System.out::println);

        //Sort Function on non-Primitive Values
        Employee e1 = new Employee(1,"Navneet","BE",20000,null);
        Employee e2 = new Employee(2,"Nakul","BE",25000,null);
        Employee e3 = new Employee(3,"Nikhil","BE",22000,null);

        List<Employee> empList = List.of(e1,e2,e3);
        empList.stream()
                .sorted(Comparator.comparingInt(Employee::getEmployeeId).reversed())
                .forEach(System.out::println);

        empList.stream()
                .sorted((t1,t2)->t1.getESalary()-t2.getESalary())
                .forEach(System.out::println);


        List<String> empNames = empList.stream()
                .map(emp -> emp.getEName())
                .collect(Collectors.toList());
        System.out.println(empNames);
    }
}
