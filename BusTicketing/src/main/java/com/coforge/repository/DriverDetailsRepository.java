package com.coforge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.model.DriverDetails;

@Repository
public interface DriverDetailsRepository extends CrudRepository<DriverDetails, Long> {

}
