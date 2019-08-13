package com.revature.datalayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{

	
}
