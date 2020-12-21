package com.coforge.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PassangerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long passangerId;
	private String passangerName;
	private Date passangerDob;
	private String passangerGender;
	private String passangerPhone;
	private String passangerAddress;
	private String passangerEmail;
	private String passangerIdProofType;
	private String passangerIdProofNumber;
	public PassangerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassangerDetails(Long passangerId, String passangerName, Date passangerDob, String passangerGender,
			String passangerPhone, String passangerAddress, String passangerEmail, String passangerIdProofType,
			String passangerIdProofNumber) {
		super();
		this.passangerId = passangerId;
		this.passangerName = passangerName;
		this.passangerDob = passangerDob;
		this.passangerGender = passangerGender;
		this.passangerPhone = passangerPhone;
		this.passangerAddress = passangerAddress;
		this.passangerEmail = passangerEmail;
		this.passangerIdProofType = passangerIdProofType;
		this.passangerIdProofNumber = passangerIdProofNumber;
	}
	public Long getPassangerId() {
		return passangerId;
	}
	public void setPassangerId(Long passangerId) {
		this.passangerId = passangerId;
	}
	public String getPassangerName() {
		return passangerName;
	}
	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}
	public Date getPassangerDob() {
		return passangerDob;
	}
	public void setPassangerDob(Date passangerDob) {
		this.passangerDob = passangerDob;
	}
	public String getPassangerGender() {
		return passangerGender;
	}
	public void setPassangerGender(String passangerGender) {
		this.passangerGender = passangerGender;
	}
	public String getPassangerPhone() {
		return passangerPhone;
	}
	public void setPassangerPhone(String passangerPhone) {
		this.passangerPhone = passangerPhone;
	}
	public String getPassangerAddress() {
		return passangerAddress;
	}
	public void setPassangerAddress(String passangerAddress) {
		this.passangerAddress = passangerAddress;
	}
	public String getPassangerEmail() {
		return passangerEmail;
	}
	public void setPassangerEmail(String passangerEmail) {
		this.passangerEmail = passangerEmail;
	}
	public String getPassangerIdProofType() {
		return passangerIdProofType;
	}
	public void setPassangerIdProofType(String passangerIdProofType) {
		this.passangerIdProofType = passangerIdProofType;
	}
	public String getPassangerIdProofNumber() {
		return passangerIdProofNumber;
	}
	public void setPassangerIdProofNumber(String passangerIdProofNumber) {
		this.passangerIdProofNumber = passangerIdProofNumber;
	}
	@Override
	public String toString() {
		return "PassangerDetails [passangerId=" + passangerId + ", passangerName=" + passangerName + ", passangerDob="
				+ passangerDob + ", passangerGender=" + passangerGender + ", passangerPhone=" + passangerPhone
				+ ", passangerAddress=" + passangerAddress + ", passangerEmail=" + passangerEmail
				+ ", passangerIdProofType=" + passangerIdProofType + ", passangerIdProofNumber="
				+ passangerIdProofNumber + "]";
	}
	
}
