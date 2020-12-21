package com.coforge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.model.BusDetails;
import com.coforge.model.BusRoute;
import com.coforge.model.DriverDetails;
import com.coforge.repository.BusDetailsRepository;
import com.coforge.repository.BusRouteRepository;
import com.coforge.repository.DriverDetailsRepository;

@RestController
public class BusRouteController {

	@Autowired
	private BusRouteRepository busRouteRepository;
	@Autowired
	private BusDetailsRepository busDetailsRepository;
	@Autowired
	private DriverDetailsRepository driverDetailsRepository;
	
	@GetMapping("/busroutes")
    public List<BusRoute> getAllBusRoute() {
    	System.out.println(busRouteRepository.findAll());
        return (List<BusRoute>) busRouteRepository.findAll();
    }
	
	@GetMapping("/busroute/{id}")
    public ResponseEntity<BusRoute> getBusRouteById(@PathVariable(value = "id") Long id) {
		Optional<BusRoute> busRoute = busRouteRepository.findById(id);
        return ResponseEntity.ok().body(busRoute.get());
    }
	
	@PostMapping("/busroutes/{busId}/{driverId}")
    public BusRoute insertBusRoute(@RequestBody BusRoute busRoute,
    		@PathVariable(value = "busId") Long busId,
    		@PathVariable(value = "driverId") Long driverId)
	{
		Optional<BusDetails> findBusById = busDetailsRepository.findById(busId);
		busRoute.setBusId(findBusById.get());
		Optional<DriverDetails> findDriverById = driverDetailsRepository.findById(driverId);
		busRoute.setDriver(findDriverById.get());
        return busRouteRepository.save(busRoute);
    }
	
	@PutMapping("/busroute/{id}/{busId}/{driverId}")
	public ResponseEntity<BusRoute> updateBusRouteById(@PathVariable(value = "id") Long id,
			@PathVariable(value = "busId") Long busId,
    		@PathVariable(value = "driverId") Long driverId,
			@RequestBody BusRoute busRoute){
		
		Optional<BusRoute> findById = busRouteRepository.findById(id);
		
		findById.get().setAvailableSeats(busRoute.getAvailableSeats());
		findById.get().setBusRoute(busRoute.getBusRoute());
		findById.get().setDestination(busRoute.getDestination());
		findById.get().setDistance(busRoute.getDistance());
		findById.get().setDuration(busRoute.getDuration());
		findById.get().setEndTime(busRoute.getEndTime());
		findById.get().setSource(busRoute.getSource());
		findById.get().setStartTime(busRoute.getStartTime());
		
		Optional<BusDetails> findBusById = busDetailsRepository.findById(busId);
		findById.get().setBusId(findBusById.get());

		Optional<DriverDetails> findDriverById = driverDetailsRepository.findById(driverId);
		findById.get().setDriver(findDriverById.get());
		
		
		BusRoute save = busRouteRepository.save(findById.get());
		return ResponseEntity.ok().body(save);
		
	}
	
	@DeleteMapping("/busroute/{id}")
	public void deleteBusRouteById(@PathVariable(value = "id") Long id){
		
		busRouteRepository.deleteById(id);;
		
	}
}
