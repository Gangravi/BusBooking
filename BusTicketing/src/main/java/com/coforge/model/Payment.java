package com.coforge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transactionId;
	private String Mode_Of_payment;
	@OneToOne
	private Booking bookingId;
	private Double amount;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(Long transactionId, String mode_Of_payment, Booking bookingId, Double amount) {
		super();
		this.transactionId = transactionId;
		Mode_Of_payment = mode_Of_payment;
		this.bookingId = bookingId;
		this.amount = amount;
	}
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public String getMode_Of_payment() {
		return Mode_Of_payment;
	}
	public void setMode_Of_payment(String mode_Of_payment) {
		Mode_Of_payment = mode_Of_payment;
	}
	public Booking getBookingId() {
		return bookingId;
	}
	public void setBookingId(Booking bookingId) {
		this.bookingId = bookingId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [transactionId=" + transactionId + ", Mode_Of_payment=" + Mode_Of_payment + ", bookingId="
				+ bookingId + ", amount=" + amount + "]";
	}
	
	
	
}
