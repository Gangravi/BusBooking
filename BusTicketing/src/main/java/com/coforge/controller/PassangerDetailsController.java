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

import com.coforge.model.PassangerDetails;
import com.coforge.repository.PassangerDetailsRepository;

@RestController
public class PassangerDetailsController {

	@Autowired
	private PassangerDetailsRepository passangerDetailsRepository;
	
	@GetMapping("/passangers")
    public List<PassangerDetails> getAllPassangers() {
    	System.out.println(passangerDetailsRepository.findAll());
        return (List<PassangerDetails>) passangerDetailsRepository.findAll();
    }
	
	@GetMapping("/passanger/{id}")
    public ResponseEntity<PassangerDetails> getDriverById(@PathVariable(value = "id") Long id) {
		Optional<PassangerDetails> passangerDetails = passangerDetailsRepository.findById(id);
        return ResponseEntity.ok().body(passangerDetails.get());
    }
	
	@PostMapping("/passangers")
    public PassangerDetails insertDriver(@RequestBody PassangerDetails passangerDetails) {
        return passangerDetailsRepository.save(passangerDetails);
    }
	
	@PutMapping("/passanger/{id}")
	public ResponseEntity<PassangerDetails> updateDriverById(@PathVariable(value = "id") Long id,
			@RequestBody PassangerDetails passangerDetails){
		
		Optional<PassangerDetails> findById = passangerDetailsRepository.findById(id);
		
		findById.get().setPassangerAddress(passangerDetails.getPassangerAddress());
		findById.get().setPassangerDob(passangerDetails.getPassangerDob());
		findById.get().setPassangerEmail(passangerDetails.getPassangerEmail());
		findById.get().setPassangerGender(passangerDetails.getPassangerGender());
		findById.get().setPassangerIdProofNumber(passangerDetails.getPassangerIdProofNumber());
		findById.get().setPassangerIdProofType(passangerDetails.getPassangerIdProofType());
		findById.get().setPassangerName(passangerDetails.getPassangerName());
		findById.get().setPassangerPhone(passangerDetails.getPassangerName());
		
		PassangerDetails save = passangerDetailsRepository.save(findById.get());
		return ResponseEntity.ok().body(save);
		
	}
	
	@DeleteMapping("/passanger/{id}")
	public void deletePassangerById(@PathVariable(value = "id") Long id){
		
		passangerDetailsRepository.deleteById(id);;
		
	}
}
