package com.coforge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.model.BusRoute;

@Repository
public interface BusRouteRepository extends CrudRepository<BusRoute, Long>{

}
