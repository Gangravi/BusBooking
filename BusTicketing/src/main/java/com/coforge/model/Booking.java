package com.coforge.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	@OneToOne
	private BusDetails busId;
	@OneToOne
	private BusRoute routeId;
	private String paymentStatus; // Pending or Done
	@OneToOne
	private Payment payment;
	@OneToOne
	private PassangerDetails passangerDetails;
	private Double totalFare;
	private LocalDateTime bookingDateTime;
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date dateOfJourney;
	private int seatNo;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Booking(Long bookingId, BusDetails busId, BusRoute routeId, String paymentStatus, Payment payment,
			PassangerDetails passangerDetails, Double totalFare, LocalDateTime bookingDateTime, Date dateOfJourney,
			int seatNo) {
		super();
		this.bookingId = bookingId;
		this.busId = busId;
		this.routeId = routeId;
		this.paymentStatus = paymentStatus;
		this.payment = payment;
		this.passangerDetails = passangerDetails;
		this.totalFare = totalFare;
		this.bookingDateTime = bookingDateTime;
		this.dateOfJourney = dateOfJourney;
		this.seatNo = seatNo;
	}

	public PassangerDetails getPassangerDetails() {
		return passangerDetails;
	}

	public void setPassangerDetails(PassangerDetails passangerDetails) {
		this.passangerDetails = passangerDetails;
	}

	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public BusDetails getBusId() {
		return busId;
	}
	public void setBusId(BusDetails busId) {
		this.busId = busId;
	}
	public BusRoute getRouteId() {
		return routeId;
	}
	public void setRouteId(BusRoute routeId) {
		this.routeId = routeId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(Double totalFare) {
		this.totalFare = totalFare;
	}
	public LocalDateTime getBookingDateTime() {
		return bookingDateTime;
	}
	public void setBookingDateTime(LocalDateTime bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}
	public Date getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", busId=" + busId + ", routeId=" + routeId + ", paymentStatus="
				+ paymentStatus + ", payment=" + payment + ", passangerDetails=" + passangerDetails + ", totalFare="
				+ totalFare + ", bookingDateTime=" + bookingDateTime + ", dateOfJourney=" + dateOfJourney + ", seatNo="
				+ seatNo + "]";
	}
	
	
	
	
}
