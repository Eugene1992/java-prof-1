package com.cbs.edu.spring_web_app.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = "employees")
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

    public Employee(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
}