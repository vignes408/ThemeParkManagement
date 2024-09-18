package com.vickee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.model.Attraction;


@Repository
public interface AttractionRepo extends JpaRepository<Attraction, Long> {

}
