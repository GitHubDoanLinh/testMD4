package com.example.test_cg_emp1.repository;

import com.example.test_cg_emp1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee>findByNameContaining(String name);
}
