package com.coforge.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coforge.model.PassangerDetails;

@Repository
public interface PassangerDetailsRepository extends CrudRepository<PassangerDetails, Long>{

	
}
