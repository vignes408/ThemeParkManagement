package com.vickee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.model.Maintainence;

@Repository
public interface MaintainenceRepo extends JpaRepository<Maintainence, Long>{

}
