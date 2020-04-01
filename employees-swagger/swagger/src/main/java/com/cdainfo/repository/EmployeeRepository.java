package com.cdainfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdainfo.dominio.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
