package com.coforge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.model.PassangerDetails;

@Repository
public interface PassangerDetailsRepository extends CrudRepository<PassangerDetails, Long>{

}
