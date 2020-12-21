package com.coforge.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class DriverDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long driverId;
	private String driverName;
	private String driverPhone;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date driverDob;
	private String driverGender;
	private String driverAddress;
	private String driverEmail;
	private String driverIdProofType;
	private String driverIdProofNumber;
	
	public DriverDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DriverDetails(Long driverId, String driverName, String driverPhone, Date driverDob, String driverGender,
			String driverAddress, String driverEmail, String driverIdProofType, String driverIdProofNumber) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverPhone = driverPhone;
		this.driverDob = driverDob;
		this.driverGender = driverGender;
		this.driverAddress = driverAddress;
		this.driverEmail = driverEmail;
		this.driverIdProofType = driverIdProofType;
		this.driverIdProofNumber = driverIdProofNumber;
	}
	public Long getDriverId() {
		return driverId;
	}
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverPhone() {
		return driverPhone;
	}
	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}
	public Date getDriverDob() {
		return driverDob;
	}
	public void setDriverDob(Date driverDob) {
		this.driverDob = driverDob;
	}
	public String getDriverGender() {
		return driverGender;
	}
	public void setDriverGender(String driverGender) {
		this.driverGender = driverGender;
	}
	public String getDriverAddress() {
		return driverAddress;
	}
	public void setDriverAddress(String driverAddress) {
		this.driverAddress = driverAddress;
	}
	public String getDriverEmail() {
		return driverEmail;
	}
	public void setDriverEmail(String driverEmail) {
		this.driverEmail = driverEmail;
	}
	public String getDriverIdProofType() {
		return driverIdProofType;
	}
	public void setDriverIdProofType(String driverIdProofType) {
		this.driverIdProofType = driverIdProofType;
	}
	public String getDriverIdProofNumber() {
		return driverIdProofNumber;
	}
	public void setDriverIdProofNumber(String driverIdProofNumber) {
		this.driverIdProofNumber = driverIdProofNumber;
	}
	@Override
	public String toString() {
		return "DriverDetails [driverId=" + driverId + ", driverName=" + driverName + ", driverPhone=" + driverPhone
				+ ", driverDob=" + driverDob + ", driverGender=" + driverGender + ", driverAddress=" + driverAddress
				+ ", driverEmail=" + driverEmail + ", driverIdProofType=" + driverIdProofType + ", driverIdProofNumber="
				+ driverIdProofNumber + "]";
	}
	
	
}
