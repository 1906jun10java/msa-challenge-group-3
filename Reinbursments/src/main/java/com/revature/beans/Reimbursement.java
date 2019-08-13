package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="REIMBURSMENT")
public class Reimbursement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="reimSequence")
	@SequenceGenerator(allocationSize=1, name="reimSequence", sequenceName="REIMBURSEMENT_PK")
    @Column(name = "REIM_ID", nullable = false)
	private int id;
	@Column(name="EMPLOYEE_NAME")
	private String employee;
	@Column(name="AMOUNT")
	private double amount;
	
	public Reimbursement() {
		super();
	}
	
	public Reimbursement(String employee, double amount) {
		super();
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

	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", employee=" + employee + ", amount=" + amount + "]";
	}
	
}
