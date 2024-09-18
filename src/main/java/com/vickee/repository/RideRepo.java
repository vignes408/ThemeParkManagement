package com.vickee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.model.Ride;

@Repository
public interface RideRepo extends JpaRepository<Ride, Long>{

}
