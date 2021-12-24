package com.example.webPhimhay.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.webPhimhay.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
