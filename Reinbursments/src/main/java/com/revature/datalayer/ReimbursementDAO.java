package com.revature.datalayer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Reimbursement;

@Repository
@Transactional
public interface ReimbursementDAO extends JpaRepository<Reimbursement, Integer> {
	public List<Reimbursement> getByUser(String user);
}
