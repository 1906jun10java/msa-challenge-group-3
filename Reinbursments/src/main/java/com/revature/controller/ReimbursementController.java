package com.revature.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Reimbursement;

@RestController
public class ReimbursementController {
	
	@GetMapping(value="/getreims", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Reimbursement getReims(){
		Reimbursement temp = new Reimbursement(1, "Bob", 250.00);
		return temp;
	}

}
