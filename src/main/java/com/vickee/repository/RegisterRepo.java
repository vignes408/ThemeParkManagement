package com.vickee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vickee.model.Register;

@Repository
public interface RegisterRepo extends JpaRepository<Register, Long>{
	
	@Query(value = "select e from Register e where email = :email and password = :password")
	Register findByName(String email, String password);

}
