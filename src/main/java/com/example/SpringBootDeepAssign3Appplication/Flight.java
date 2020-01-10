package com.example.SpringBootDeepAssign3Appplication;

public class Flight {
	private int FlightId;
	private String AirlineName;
	private String DepartAirport;
	private String ArrivalAirport;
	private String DepartTime;
	private String ArrivalTime;
	private String Duration;
	private int TotalSeats;

	public Flight(int FlightId, String AirlineName, String DepartAirport, String ArrivalAirport, String DepartTime, String ArrivalTime, String Duration, int TotalSeats ) {
		this.FlightId = FlightId;
		this.AirlineName = AirlineName;
		this.DepartAirport = DepartAirport;
		this.ArrivalAirport = ArrivalAirport;
		this.DepartTime = DepartTime;
		this.ArrivalTime = ArrivalTime;
		this.Duration = Duration;
		this.TotalSeats = TotalSeats;
	}
	
	public void setFlightId(int value) {
		this.FlightId = value;
	}
	public int getFlightId() {
		return FlightId;
	}
	
	public void setAirlineName(String value) {
		this.AirlineName = value;
	}
	public String getAirlineName() {
		return AirlineName;
	}
	
	public void setDepartAirport(String value) {
		this.DepartAirport = value;
	}
	public String getDepartAirport() {
		return DepartAirport;
	}
	
	public void setArrivalAirport(String value) {
		this.ArrivalAirport = value;
	}
	public String getArrivalAirport() {
		return ArrivalAirport;
	}
	
	public void setDepartTime(String value) {
		this.DepartTime = value;
	}
	public String getDepartTime() {
		return DepartTime;
	}
	
	public void setArrivalTime(String value) {
		this.ArrivalTime = value;
	}
	public String getArrivalTime() {
		return ArrivalTime;
	}
	
	public void setDuration(String value) {
		this.Duration = value;
	}
	public String getDuration() {
		return Duration;
	}
	
	public void setTotalSeats(Integer value) {
		this.TotalSeats = value;
	}
	public Integer getTotalSeats() {
		return TotalSeats;
	}
	
}
