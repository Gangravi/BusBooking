package com.coforge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.model.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Long>{

}
