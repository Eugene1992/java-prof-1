package spring.jdbs_template.repository.entity;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class Employee extends AbstractEmployee {
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


