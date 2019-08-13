package com.revature.controller;

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

import com.revature.beans.Destroyer;
import com.revature.datalayer.DestroyerDAO;

@RestController
public class DestroyerController {
	
	private DestroyerDAO dDAO;
	@Value("@{message: The from of the destroyer has been chosen")
	private String message;
	
	//This is constructor injection with spring magic!
	@Autowired
	public DestroyerController(DestroyerDAO dDAO) {
		this.dDAO = dDAO;
	}
	
	@GetMapping("/destroyermessage")
	public String getMessage() {
		return this.message;
	}
	
	@GetMapping(value="/getdestroyer", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Destroyer>> getDestroyers(){
		return new ResponseEntity<>(this.dDAO.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(value="/adddestroyer")
	public void addDestroyer(@RequestBody Map<String, Object> body) {
		String destroyerName = (String) body.get("destroyer");
		Destroyer destroyer = new Destroyer(destroyerName);
	}

}
