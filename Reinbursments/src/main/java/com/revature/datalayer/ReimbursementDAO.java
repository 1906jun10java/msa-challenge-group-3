package com.revature.datalayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Reimbursement;

@Repository
@Transactional
public interface ReimbursementDAO extends JpaRepository<Reimbursement, Integer> {
	
}
