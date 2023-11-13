package com.example.test_cg_emp1.service;
import com.example.test_cg_emp1.model.Employee;

import java.util.List;

public interface IEmployeeService extends IGenneralService<Employee> {
    List<Employee> findByNameContaining(String name);
}
