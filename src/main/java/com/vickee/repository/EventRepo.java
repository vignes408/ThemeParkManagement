package com.vickee.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.model.Events;

@Repository
public interface EventRepo extends JpaRepository<Events, Long>{

}
