package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Employee;
import com.revature.datalayer.EmployeeDAO;

@RestController
public class EmployeeController {
    
    private EmployeeDAO eDAO;
    
    @Value("${message: Who you gonna call?}")
    private String message;
    
    @Autowired
    public EmployeeController(EmployeeDAO eDAO)
    {
    	this.eDAO = eDAO;
    }

    @GetMapping("/message")
    public String getMessage() {
    	return this.message;
    }
    
    @GetMapping(value = "/employees", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Employee>> getEmployees() {
        return new ResponseEntity<>(this.eDAO.findAll(), HttpStatus.OK);
    }
    
    @PostMapping(value="/add")
	public void addEmp(@RequestBody Map<String, Object> body) {
		String firstName = (String) body.get("firstName");
		String lastName = (String) body.get("lastName");
		String email = (String) body.get("email");
		
		Employee emp = new Employee(firstName, lastName, email);
		this.eDAO.save(emp);
	}
}