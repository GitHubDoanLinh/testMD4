package com.example.test_cg_emp1.repository;

import com.example.test_cg_emp1.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Long>{

}
