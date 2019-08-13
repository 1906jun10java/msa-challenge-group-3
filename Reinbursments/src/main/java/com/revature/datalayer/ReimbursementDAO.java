package com.revature.datalayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Reimbursement;

@Repository
public interface ReimbursementDAO extends JpaRepository<Reimbursement, Integer> {
//	public List<Reimbursement> getByUser(String user);
}
