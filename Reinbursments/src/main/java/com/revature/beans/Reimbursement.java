package com.revature.beans;

public class Reimbursement {
	
	private int id;
	private String employee;
	private double amount;
	
	public Reimbursement() {
		super();
	}
	
	public Reimbursement(int id, String employee, double amount) {
		super();
		this.id = id;
		this.employee = employee;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
