package com.example.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name = "start_time")
	private String startTime;
	@Column(name = "end_time")
	private String endTime;
	@Column(name = "event_location")
	private String location;
	@Column(name = "event_cost")
	private int cost;
	@Column(name = "volunteer_amount")
	private int volunteerAmount;
	@Column(name = "event_name")
	private String eventName;
	@Column(name = "event_description")
	private String eventDescription;
	@Column(name = "event_date")
	private String edate;
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public User() {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.location = location;
		this.cost = cost;
		this.volunteerAmount = volunteerAmount;
		this.eventName = eventName;
		this.eventDescription = eventDescription;
		this.edate = edate;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", location=" + location
				+ ", cost=" + cost + ", volunteerAmount=" + volunteerAmount + ", eventName=" + eventName
				+ ", eventDescription=" + eventDescription + ", edate=" + edate + "]";
	}
	
	
	
	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getVolunteerAmount() {
		return volunteerAmount;
	}
	public void setVolunteerAmount(int volunteerAmount) {
		this.volunteerAmount = volunteerAmount;
	}
	
	
}
