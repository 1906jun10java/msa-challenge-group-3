package com.revature.datalayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Destroyer;

@Repository
public interface DestroyerDAO extends JpaRepository<Destroyer, Integer> {


}
