package com.vickee.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.model.Booking;


@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {
	List<Booking> findByRegid(String regid);
}
