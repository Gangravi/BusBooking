package com.coforge.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.model.BusRoute;

@Repository
public interface BusRouteRepository extends CrudRepository<BusRoute, Long>{

	public List<BusRoute> findBySourceAndDestination(String source, String destination);
}
