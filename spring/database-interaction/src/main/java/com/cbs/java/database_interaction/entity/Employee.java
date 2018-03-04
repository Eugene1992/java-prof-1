package com.cbs.java.database_interaction.entity;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class Employee extends AbstractEntity {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public Employee(Integer id, String firstName, String lastName, int age, int salary) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
}