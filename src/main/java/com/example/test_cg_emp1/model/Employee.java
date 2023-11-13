package com.example.test_cg_emp1.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeecode;
    private String name;
    private Integer age;
    private Float salary;
    @ManyToOne
    @JoinColumn(name = "id_department")
    private Department department;

}
