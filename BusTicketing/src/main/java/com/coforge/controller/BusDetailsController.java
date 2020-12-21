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
import com.coforge.repository.BusDetailsRepository;


@RestController
public class BusDetailsController {

	@Autowired
	private BusDetailsRepository busDetailsRepository;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Bus Booking Service";
	}
	
	@GetMapping("/buses")
    public List<BusDetails> getAllBuses() {
    	System.out.println(busDetailsRepository.findAll());
        return (List<BusDetails>) busDetailsRepository.findAll();
    }
	
	@GetMapping("/bus/{id}")
    public ResponseEntity<BusDetails> getBusById(@PathVariable(value = "id") Long id) {
		Optional<BusDetails> busDetails = busDetailsRepository.findById(id);
        return ResponseEntity.ok().body(busDetails.get());
    }
	
	@PostMapping("/buses")
    public BusDetails insertBus(@RequestBody BusDetails busDetails) {
        return busDetailsRepository.save(busDetails);
    }
	
	@PutMapping("/bus/{id}")
	public ResponseEntity<BusDetails> updateBusById(@PathVariable(value = "id") Long id,
			@RequestBody BusDetails busDetails){
		Optional<BusDetails> findById = busDetailsRepository.findById(id);
		findById.get().setBusNumber(busDetails.getBusNumber());
		findById.get().setBusType(busDetails.getBusType());
		findById.get().setBaseFare(busDetails.getBaseFare());
		findById.get().setNoOfSeats(busDetails.getNoOfSeats());
		BusDetails save = busDetailsRepository.save(findById.get());
		return ResponseEntity.ok().body(save);
		
	}
	
	@DeleteMapping("/bus/{id}")
	public void deleteBusById(@PathVariable(value = "id") Long id){
		
		busDetailsRepository.deleteById(id);;
		
	}
}
