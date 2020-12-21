package com.coforge.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class BusRoute {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long routeId;
	
	@OneToOne
	private BusDetails busId;
	
	@OneToOne
	private DriverDetails driver;
	
	private String busRoute;
	private String startTime;
	private String endTime;
	private String duration;
	private String availableSeats;
	private Double distance;
	private String source;
	private String destination;
	public BusRoute() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BusRoute(Long routeId, BusDetails busId, DriverDetails driver, String busRoute, String startTime,
			String endTime, String duration, String availableSeats, Double distance, String source,
			String destination) {
		super();
		this.routeId = routeId;
		this.busId = busId;
		this.driver = driver;
		this.busRoute = busRoute;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
		this.availableSeats = availableSeats;
		this.distance = distance;
		this.source = source;
		this.destination = destination;
	}

	public Long getRouteId() {
		return routeId;
	}
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
	
	public BusDetails getBusId() {
		return busId;
	}

	public void setBusId(BusDetails busId) {
		this.busId = busId;
	}

	public DriverDetails getDriver() {
		return driver;
	}

	public void setDriver(DriverDetails driver) {
		this.driver = driver;
	}

	public String getBusRoute() {
		return busRoute;
	}
	public void setBusRoute(String busRoute) {
		this.busRoute = busRoute;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(String availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "BusRoute [routeId=" + routeId + ", busId=" + busId + ", driver=" + driver + ", busRoute=" + busRoute
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", duration=" + duration + ", availableSeats="
				+ availableSeats + ", distance=" + distance + ", source=" + source + ", destination=" + destination
				+ "]";
	}
	
	
	
}
