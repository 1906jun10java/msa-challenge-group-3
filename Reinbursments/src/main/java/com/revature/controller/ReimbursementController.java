package com.revature.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Reimbursement;
import com.revature.datalayer.ReimbursementDAO;

@RestController
public class ReimbursementController {
	
	private ReimbursementDAO rDAO;
	
	@Autowired
	public ReimbursementController(ReimbursementDAO rDAO) {
		this.rDAO = rDAO;
	}
	
	@GetMapping(value="/getreims", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Reimbursement>> getReims(){
		return new ResponseEntity<>(this.rDAO.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(value="/add")
	public void addReim(@RequestBody Map<String, Object> body) {
		String emp = (String) body.get("employee");
		double amount = (double) body.get("amount");
		
		Reimbursement reim = new Reimbursement(emp, amount);
		this.rDAO.save(reim);
	}

}
