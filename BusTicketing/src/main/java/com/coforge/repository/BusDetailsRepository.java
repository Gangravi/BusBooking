package com.coforge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.model.BusDetails;

@Repository
public interface BusDetailsRepository extends CrudRepository<BusDetails, Long>{

}
