package com.coforge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.model.Booking;
import com.coforge.model.Payment;
import com.coforge.repository.BookingRepository;
import com.coforge.repository.PaymentRepository;

@RestController
public class PaymentController {

	@Autowired
	private PaymentRepository paymentRepository;
	@Autowired
	private BookingRepository bookingRepository;
	
	@GetMapping("/payments")
    public List<Payment> getAllPayments() {
    	System.out.println(paymentRepository.findAll());
        return (List<Payment>) paymentRepository.findAll();
    }
	
	@GetMapping("/payment/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable(value = "id") Long id) {
		Optional<Payment> payment = paymentRepository.findById(id);
        return ResponseEntity.ok().body(payment.get());
    }
	
	@PostMapping("/payments/{bookingId}")
    public Payment insertPayment(@RequestBody Payment payment,
    		@PathVariable(value = "bookingId") Long bookingId) {
        Optional<Booking> findById = bookingRepository.findById(bookingId);
        payment.setBookingId(findById.get());
      
        findById.get().setPayment(payment);
        findById.get().setPaymentStatus("Done");
		return paymentRepository.save(payment);
    }
	
	
}
