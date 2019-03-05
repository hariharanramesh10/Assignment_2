package com.macs.groupone.employerportalapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.macs.groupone.employerportalapplication.domain.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Employee getEmployeeByEmailAndPassword(String email,String password);
}
