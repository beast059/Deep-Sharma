package com.example.SpringBootDeepAssign3Appplication;

public class Ticket {
	private int TicketId;
	private int PassengerId;
	private int FlightId;
	private String DepartureDate;
	private Double AmountPaid;
	private String Status;

	public Ticket(int TicketId, int PassengerId, int FlightId, String DepartureDate, Double AmountPaid, String Status) {
		this.TicketId = TicketId;
		this.PassengerId = PassengerId;
		this.FlightId = FlightId;
		this.DepartureDate = DepartureDate;
		this.AmountPaid = AmountPaid;
		this.Status = Status;
	}
	
	public void setTicketId(int value) {
		this.TicketId = value;
	}
	public int getTicketId() {
		return TicketId;
	}
	
	public void setPassengerId(int value) {
		this.PassengerId = value;
	}
	public int getPassengerId() {
		return PassengerId;
	}
	
	public void setFlightId(int value) {
		this.FlightId = value;
	}
	public int getFlightId() {
		return FlightId;
	}
	
	public void setDepartureDate(String value) {
		this.DepartureDate = value;
	}
	public String getDepartureDate() {
		return DepartureDate;
	}
	
	public void setAmountPaid(Double value) {
		this.AmountPaid = value;
	}
	public Double getAmountPaid() {
		return AmountPaid;
	}
	
	public void setStatus(String value) {
		this.Status = value;
	}
	public String getStatus() {
		return Status;
	}
	
}
