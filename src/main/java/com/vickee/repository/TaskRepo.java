package com.vickee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.model.Tasks;

@Repository
public interface TaskRepo extends JpaRepository<Tasks, Long> {

}
