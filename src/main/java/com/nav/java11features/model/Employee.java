package com.nav.java11features.model;


import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {
    private Integer employeeId;
    private String eName;
    private String eDesignation;
    private Integer eSalary;
    private List<String> eSkills;
}
