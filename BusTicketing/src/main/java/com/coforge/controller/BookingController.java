package com.coforge.controller;

import java.time.LocalDateTime;
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

import com.coforge.model.Booking;
import com.coforge.model.BusRoute;
import com.coforge.model.PassangerDetails;
import com.coforge.model.Payment;
import com.coforge.repository.BookingRepository;
import com.coforge.repository.BusRouteRepository;
import com.coforge.repository.PassangerDetailsRepository;
import com.coforge.repository.PaymentRepository;

@RestController
public class BookingController {

	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	private BusRouteRepository busRouteRepository;
	@Autowired
	private PaymentRepository paymentRepository;
	@Autowired
	private PassangerDetailsRepository passangerDetailsRepository;
	
	@GetMapping("/bookings")
    public List<Booking> getAllBooking() {
    	System.out.println(bookingRepository.findAll());
        return (List<Booking>) bookingRepository.findAll();
    }
	
	@GetMapping("/booking/{id}")
    public ResponseEntity<Booking> getBusById(@PathVariable(value = "id") Long id) {
		Optional<Booking> bookingDetails = bookingRepository.findById(id);
        return ResponseEntity.ok().body(bookingDetails.get());
    }
	
	@PostMapping("/bookings/{routeId}/{passangerId}")
    public Booking insertBus(@RequestBody Booking bookingDetails,
    		@PathVariable(value = "routeId") Long routeId,
    		@PathVariable(value = "passangerId") Long passangerId) {
		Optional<BusRoute> findRouteById = busRouteRepository.findById(routeId);
		
		bookingDetails.setBusId(findRouteById.get().getBusId());
		bookingDetails.setRouteId(findRouteById.get());
		
		Double baseFare = findRouteById.get().getBusId().getBaseFare();
		Double distance = findRouteById.get().getDistance();
		Double totalFare = baseFare*distance;
		bookingDetails.setTotalFare(totalFare);
		
		LocalDateTime localDate = LocalDateTime.now();
		bookingDetails.setBookingDateTime(localDate);
		
		Optional<PassangerDetails> findPassangerById = passangerDetailsRepository.findById(passangerId);
		bookingDetails.setPassangerDetails(findPassangerById.get());
		
		
        return bookingRepository.save(bookingDetails);
    }
	@PostMapping("/bookings/{}")
	public Booking completePayment() {
		return null;
		
	}
	
}
