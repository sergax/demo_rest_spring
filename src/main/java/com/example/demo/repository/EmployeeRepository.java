package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * by Aksenchenko Serhii on 06.04.2022
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
