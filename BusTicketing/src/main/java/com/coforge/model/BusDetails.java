package com.coforge.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BusDetails implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long busId;
	private String busNumber;
	private String busType;
	private Double baseFare;
	private int noOfSeats;	
	
	
	public BusDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public BusDetails(Long busId, String busNumber, String busType, Double baseFare, int noOfSeats) {
		super();
		this.busId = busId;
		this.busNumber = busNumber;
		this.busType = busType;
		this.baseFare = baseFare;
		this.noOfSeats = noOfSeats;
	}


	public Long getBusId() {
		return busId;
	}
	public void setBusId(Long busId) {
		this.busId = busId;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public Double getBaseFare() {
		return baseFare;
	}
	public void setBaseFare(Double baseFare) {
		this.baseFare = baseFare;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	@Override
	public String toString() {
		return "BusDetails [busId=" + busId + ", busNumber=" + busNumber + ", busType=" + busType + ", baseFare="
				+ baseFare + ", noOfSeats=" + noOfSeats + "]";
	}
	
	
	
}
