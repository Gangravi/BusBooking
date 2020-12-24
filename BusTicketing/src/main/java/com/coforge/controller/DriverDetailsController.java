package com.coforge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.model.DriverDetails;
import com.coforge.repository.DriverDetailsRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DriverDetailsController {

	@Autowired
	private DriverDetailsRepository driverDetailsRepository;
	
	@GetMapping("/drivers")
    public List<DriverDetails> getAllDrivers() {
    	System.out.println(driverDetailsRepository.findAll());
        return (List<DriverDetails>) driverDetailsRepository.findAll();
    }
	
	@GetMapping("/driver/{id}")
    public ResponseEntity<DriverDetails> getDriverById(@PathVariable(value = "id") Long id) {
		Optional<DriverDetails> driverDetails = driverDetailsRepository.findById(id);
        return ResponseEntity.ok().body(driverDetails.get());
    }
	
	@PostMapping("/drivers")
    public DriverDetails insertDriver(@RequestBody DriverDetails driverDetails) {
        return driverDetailsRepository.save(driverDetails);
    }
	
	@PutMapping("/driver/{id}")
	public ResponseEntity<DriverDetails> updateDriverById(@PathVariable(value = "id") Long id,
			@RequestBody DriverDetails driverDetails){
		
		Optional<DriverDetails> findById = driverDetailsRepository.findById(id);
		
		findById.get().setDriverAddress(driverDetails.getDriverAddress());
		findById.get().setDriverDob(driverDetails.getDriverDob());
		findById.get().setDriverEmail(driverDetails.getDriverEmail());
		findById.get().setDriverGender(driverDetails.getDriverGender());
		findById.get().setDriverIdProofNumber(driverDetails.getDriverIdProofNumber());
		findById.get().setDriverIdProofType(driverDetails.getDriverIdProofType());
		findById.get().setDriverName(driverDetails.getDriverName());
		findById.get().setDriverPhone(driverDetails.getDriverPhone());
		
		DriverDetails save = driverDetailsRepository.save(findById.get());
		return ResponseEntity.ok().body(save);
		
	}
	
	@DeleteMapping("/driver/{id}")
	public void deleteDriverById(@PathVariable(value = "id") Long id){
		
		driverDetailsRepository.deleteById(id);;
		
	}
}
